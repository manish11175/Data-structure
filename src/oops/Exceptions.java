package oops;

public class Exceptions {
    public static void main(String [] args) {
        try{
            int c=4/0;
            System.out.println(c);

        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage()+"inside 1st catch");
        }
        catch (Exception e) {

            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("program is executing");
        }

    }
}
