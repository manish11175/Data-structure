package oops.Interfaces;

public interface Youtuber {
    void makeVideo();

    default void upload(){
        System.out.println("video uploading..................");
    }
}

interface Tiktoker extends Youtuber{
    default void upload(){
        System.out.println("video uploading by tiktoker..................");
    }
}