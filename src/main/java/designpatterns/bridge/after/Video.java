package designpatterns.bridge.after;

public class Video implements Driver {

    @Override
    public void manage() {
        System.out.println("Video is working");
    }


}
