class Solution {
    private void reverse(StringBuilder sb,int start,int end){
        while(start < end){
            char temp = sb.charAt(start);
            sb.setCharAt(start++,sb.charAt(end));
            sb.setCharAt(end--,temp);
        }
    }
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder result = new StringBuilder() ;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(result.length());
            } else if (ch == ')'){
                int length = st.pop();
                reverse(result,length,result.length()-1);
            }else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}