package oops.Interfaces;

public class Person implements Student,Youtuber {
    public static void main(String args[]){
        Person manish=new Person();
        manish.makeVideo();
        manish.study();
        Youtuber varun=manish;
        varun.makeVideo(); // upcasting the youtube
        varun.upload();
        Student.staticclass();
        manish.main();


    }

    public void study(){
        System.out.println("study");
    }
    public void makeVideo(){
        System.out.println("making video");
    }
}
