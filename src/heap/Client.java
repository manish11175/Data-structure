package heap;

public class Client {
   public static void main(String[] args){
       Heap hp=new Heap();
       hp.add(23);
       hp.add(25);
       hp.add(12);
       hp.add(4);
       hp.add(8);

       hp.display();
//       System.out.println(hp.peek());
//       System.out.println(hp.isEmpty());
       System.out.println(hp.remove());
       hp.display();
       System.out.println(hp.remove());
       hp.display();
       System.out.println(hp.remove());
       hp.display();

   }


}
