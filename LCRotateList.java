/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class LCRotateList {
	public static void main(String[] args){
		int[] arr = {0,1,2};
		ListNode l = new ListNode(arr[arr.length-1]);
		for(int z=arr.length-2; z>=0; z--){
			l=new ListNode(arr[z],l);
		}
		
		ListNode x = rotateRight(l,4);
	}
    public static ListNode rotateRight(ListNode head, int k) {
        int ct=1;
        ListNode cur = head;
        while(cur.next!=null){
            cur=cur.next;
            ct+=1;
        }
        cur.next=head;
        ListNode tmp = head;
		  k = k%ct;
        for(int z=0; z<ct-k-1; z++){
            tmp = tmp.next;
        }
        ListNode blah = tmp.next;
        tmp.next=null;
        return blah;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}