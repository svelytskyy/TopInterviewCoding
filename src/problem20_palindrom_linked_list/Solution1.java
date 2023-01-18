package problem20_palindrom_linked_list;

public class Solution1 {
	
    public boolean isPalindrome(ListNode head) {
        String s = getString(head);
         if(s.isEmpty()) return false;
         if(s.length() == 1) return true; 
         int left = 0;
         int right = s.length()-1;
         while(left < right){
             if(s.charAt(left) != s.charAt(right)){
                 return false;
             }
             left++;
             right--;
         }
         return true;
     }
     
     public String getString(ListNode head){
         ListNode node = head;
         StringBuilder s = new StringBuilder();
         while(node != null){
             s.append(node.val);
             node = node.next;
         }
         return s.toString();
     }

}
