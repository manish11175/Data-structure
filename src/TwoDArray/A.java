package TwoDArray;

//import java.util.Locale;

public class A {
    A(){

         class B{
            B(){
                class Local{
                    public  void local(){
                        System.out.println("inside B");
                    }
                }
                Local l=new Local();
                l.local();
                Local l1=new Local(){
                  public void local(){
                      System.out.println("inside anonymous");
                  }

                };
                l1.local();
            }
        }
        B b=new B();
    }
}


class Test{

    public static void main(String args[]){

      A a=new A();
    }


}
