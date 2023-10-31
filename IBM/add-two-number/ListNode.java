
// Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        // Create two example linked lists for testing
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the addTwoNumbers method to add the two linked lists
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {

            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       // to store resul, need a list
       ListNode dummy = new ListNode(0); // initiate with any value, say 0
       // because it is sum of numbers , need to take care about carry 
       int carry = 0;
        ListNode curr = dummy; // initializing pointer
       // iterate and sum the nides of gives lists
       while(l1 != null || l2 != null || carry == 1){
           int sum = 0; // to store total sum
           if(l1 != null){
               sum += l1.val;
               l1 = l1.next;
           }
           if(l2 != null){
               sum += l2.val;
               l2 = l2.next;
           }
           sum += carry;
           carry = sum / 10;
           ListNode node = new ListNode(sum % 10);
           curr.next = node;
           curr = curr.next;
       }
       return dummy.next;
    }
}

/*
Time Complexity :- BigO(max(N, M)) where N is length of l1 & M is length of l2
Space Complexity :- BigO(max(N,M))
*/
