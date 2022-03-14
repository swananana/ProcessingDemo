import processing.core.PApplet;

public class ProcessingDemo extends PApplet{
    public static int height = 488;
    public static int width = 640;
    public static int x=0;
    public static int speed;
    public static void main(String... args){
        PApplet.main("ProcessingDemo");
    }

    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void setup() {
        loop();
    }

    //@Override
    public void draw() {
        ellipse(x,height/5,20,20);
        ellipse(x,(2*height)/5,20,20);
        ellipse(x,(3*height)/5,20,20);
        ellipse(x,(4*height)/5,20,20);
        x= x+1;
        if(x>width){
            x=0;
        }

    }


}