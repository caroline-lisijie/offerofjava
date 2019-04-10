package Merge;

import com.company.Main;

public class ListNodeMerge {
    public static class ListNode{
    int value;
    ListNode next;
}
    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.value = 1;

        head.next = new ListNode();
        head.next.value = 2;

        head.next.next = new ListNode();
        head.next.next.value = 3;

        head.next.next.next = new ListNode();
        head.next.next.next.value = 4;

        head.next.next.next.next = new ListNode();
        head.next.next.next.next.value = 5;


        ListNode head2 = new ListNode();
        head2.value = 1;

        head2.next = new ListNode();
        head2.next.value = 3;

        head2.next.next = new ListNode();
        head2.next.next.value = 5;

        head2.next.next.next = new ListNode();
        head2.next.next.next.value = 6;

        head2.next.next.next.next = new ListNode();
        head2.next.next.next.next.value = 7;

        head = merge(head,head2);
        printList(head);

    }
    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.value+"->");
            head=head.next;
        }
        System.out.println("null");

    }
    private static ListNode merge(ListNode head, ListNode head2){
        ListNode mergehead=new ListNode();
        ListNode p=mergehead;
        if(head==null)
            return head2;
        if(head2==null)
            return head;

        while(head!=null&&head2!=null) {
            if(head.value<=head2.value){
                p.next=head;
                p=p.next;
                head=head.next;
            }
            else{
                p.next=head2;
                p=p.next;
                head2=head2.next;
            }
        }
        if(head!=null){
            p.next=head;
        }
        if(head2!=null){
            p.next=head2;
        }
        return mergehead.next;
    }
}
