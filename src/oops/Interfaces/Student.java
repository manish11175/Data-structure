package oops.Interfaces;

public interface Student {
       void study();
       static void staticclass(){
              System.out.println("static class in interface");
       }
       default  void  main(){
              Student.staticclass();
       }
}
