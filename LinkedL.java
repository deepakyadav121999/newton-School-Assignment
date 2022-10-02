public class LinkedL {
    static class Node{
        int data;
        Node next;

    }
      static class LinkedList {

          Node head;

     void pushLast  (int data){
           Node newNode = new Node();
        newNode.data =data;
         newNode.next= null;


           if(head==null){
               head =newNode;

           }
           else{
               Node temp = head;

               while(temp.next!=null) {
                   temp = temp.next;

               }
               temp.next = newNode;
           }

        }
        int popLast (int data) {
              Node newNode = new Node();
              newNode.data =data;
              newNode.next= null;


              if(head==null){
                  System.out.println("Linked list is empty");
                  return -1;
              }
              if(head.next==null){
                  data = head.data;
                  head =null;
                  return data;
              }

              Node prev =head;
              Node curr = head.next;
              while (curr.next!=null) {
                  prev = prev.next;
                  curr = curr.next;
              }
              prev.next =null;
              return curr.data;

          }
       void printLL(){
           Node temp = head;
           while(temp!=null) {
               System.out.print(temp.data+"-->");
               temp = temp.next;
           }
           System.out.println("null");
       }


      }
  static class LinkedListTest {
    public static void main(String[] args) {
        int data = 0;
     LinkedList myLinkedliist = new LinkedList();
          myLinkedliist.pushLast(40);
            myLinkedliist.pushLast(50);
            myLinkedliist.pushLast(30);
            myLinkedliist.pushLast(10);
            myLinkedliist.pushLast(60);

        myLinkedliist.printLL();

        System.out.println("the element of popLast is:->"+ myLinkedliist.popLast(data));
        myLinkedliist.printLL();


    }
    }
}
