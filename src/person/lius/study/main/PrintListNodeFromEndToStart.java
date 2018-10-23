package person.lius.study.main;

import java.util.ArrayList;
import java.util.Collections;

public class PrintListNodeFromEndToStart {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode head = null;
        head = crate(1);
        int a = 0;
        list = printListFromTailToHead(head);
        int c = 0;
    }
    public static ListNode crate(int a){
        ListNode start = null;
        ListNode end = null;
        ListNode list = null;
        for (int i = 0; i < 7; i ++){
            list= new ListNode(i * 5);
            if (start == null){
                start = list;
                end = list;
            }
            else {
                end.nextNode = list;
                end = list;
            }
            list.nextNode = null;
        }
        int d = 0;
        return start;
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null){
            list.add(listNode.val);
            listNode = listNode.nextNode;
        }
        Collections.reverse(list);
        return list;

    }
}
