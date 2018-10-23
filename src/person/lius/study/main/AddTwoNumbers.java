package person.lius.study.main;

public class AddTwoNumbers {
    private static ListNode crate1(int a){
        ListNode list;
        ListNode first = null, end = null;
        switch (a){
            case 1:{
                for (int i = 6; i < 9; i ++){
                    list = new ListNode(i);

                    if (first == null){
                        first=list;
                        end=list;
                    }
                    else {
                        end.nextNode=list;
                        end=list;
                    }
                    list.nextNode = null;

                }
            }
        }
        return first;
    }
    private static ListNode crate2(int a){
        ListNode list;
        ListNode first = null, end = null;
        switch (a){
            case 1:{
                for (int i = 8; i > 3; i --){
                    list = new ListNode(i*3);

                    if (first == null){
                        first=list;
                        end=list;
                    }
                    else {
                        end.nextNode=list;
                        end=list;
                    }
                    list.nextNode = null;

                }
            }
        }
        return first;
    }

    public static void main(String[] args){
        ListNode list1 = crate1(1);

        ListNode list2 = crate2(1);

        ListNode sum = add(list1,list2);

        while (sum != null){
            System.out.println(sum.val);
            sum = sum.nextNode;
        }

    }
    private static ListNode add(ListNode list1, ListNode list2){
        ListNode sum = null;
        ListNode head = null;
        ListNode end = null;
        int temp = 0;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        while (list1 != null || list2 != null || temp != 0){
            sum = new ListNode(temp);
            temp = 0;
            if (list1 != null && list2 != null) {
                sum.val += list1.val + list2.val;
                System.out.println(list1.val + "l1 " + list2.val + "l2 " + sum.val + "hhhh");
                if (sum.val > 9){
                    int a = sum.val / 10;
                    temp = a;
                    sum.val = sum.val % 10;
                }
                list2 = list2.nextNode;
                list1 = list1.nextNode;
            }
            else if (list1 == null && list2!= null) {
                sum.val += list2.val;
                if (sum.val > 9){
                    int a = sum.val / 10;
                    temp = a;
                    sum.val = sum.val % 10;
                }
                list2 = list2.nextNode;
            }
            else if (list2 == null && list1 != null) {
                sum.val += list1.val;
                if (sum.val > 9){
                    int a = sum.val / 10;
                    temp = a;
                    sum.val = sum.val % 10;
                }
                list1 = list1.nextNode;
            }

            if (head == null){
                head=sum;
                end=sum;
            }
            else {
                end.nextNode=sum;
                end=sum;
            }
            //System.out.println(list1.val + "+" + list2.val + "=" + sum.val);
        }
        return head;

    }



}
class ListNode {
    int val;
    ListNode nextNode;
    ListNode(int val) {
        this.val=val;
        this.nextNode=null;
    }
}

//You are given two non-empty linked lists representing two non-negative integers. The digits
// are stored in reverse order and each of their nodes contain a single digit. Add the two
// numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Example:
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.