class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDistance = Integer.MAX_VALUE;
        int firstCriticalPos = 0;
        int previousCriticalPos = 0;
        int i = 1;
       
      ListNode prev = head;
      ListNode curr = head.next;
      
      while( curr != null && curr.next != null){
        if((curr.val < prev.val && curr.val < curr.next.val) || (curr.val > prev.val && curr.val > curr.next.val) ){
          if(previousCriticalPos == 0){
            previousCriticalPos = i;
            firstCriticalPos = i;
          } else {
              minDistance = Math.min(minDistance, i - previousCriticalPos);
              previousCriticalPos = i; 
          }
        }
        i++;
        curr = curr.next;
        prev = prev.next;
      }
        
      if(minDistance == Integer.MAX_VALUE){
        return new int [] {-1,-1};
      }
      
      return new int [] {minDistance, previousCriticalPos -firstCriticalPos };

      
      
    }
}