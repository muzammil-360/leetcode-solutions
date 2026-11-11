/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        createCopy(head);
        connectRandom(head);
        return connectNext(head);
    }
    public void createCopy(Node head){
        Node temp=head;
        while(temp!=null){
            Node copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }
    }
    public void connectRandom(Node head){
        Node temp=head;
        while(temp!=null){
            Node copy=temp.next;
            if(temp.random!=null){copy.random=temp.random.next;}
            else{copy.random=null;}
            temp=temp.next.next;
        }
    }
    public Node connectNext(Node head){
        Node dNode=new Node(-1);
        Node prev=dNode;
        Node temp=head;
        while(temp!=null){
            prev.next=temp.next;
            prev=prev.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dNode.next;
    }
}