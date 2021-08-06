package linkedlist;

public class Main {

    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2); 
        linkedList.addFirst(1);
          linkedList.addLast(5);
          linkedList.addLast(6);
         Node temp=new Node(2);
          //        linkedList.addAtPos(new Node(9), 2);
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        linkedList.removeAtPos(2);
//        //linkedList.addFirst(10);
//        System.out.println(linkedList.findMidWithoutSize().getData());
//        linkedList.display();
//        linkedList.getFirst();
//        linkedList.getLast();
//        linkedList.getAt(2);
//        linkedList.display();
//        linkedList.reverseByPointer();
//       
//   linkedList.display();
//        System.out.println();
//        linkedList.removeDuplicate();
   // linkedList.foldLL();  
          linkedList.display();
//          linkedList.reverse();
//          System.out.println();
//          linkedList.display();
//          System.out.println();
//          linkedList.reverseDR();
//          linkedList.reverseRD1();
            System.out.println();
         // System.out.println("kth ele from last "+linkedList.kFromLast(2));
        
          
//          System.out.println(linkedList.isPalindrome());
//        
//            linkedList2.addFirst(6);
//            linkedList2.addFirst(5);
//            linkedList2.addFirst(4);
//            linkedList2.addFirst(3);
//           
//            
//            
//            linkedList2.display();
//            System.out.println();
//       LinkedList result=LinkedList.mergeTwoSortedList(linkedList,linkedList2);
//       result.display();
        LinkedList.makeCycle(linkedList);
            System.out.println(LinkedList.isCycle(linkedList));
            
    }
}

//3,2,1,0

//1