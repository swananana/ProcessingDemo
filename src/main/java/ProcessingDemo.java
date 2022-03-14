import processing.core.PApplet;

public class ProcessingDemo extends PApplet{

    public static void main(String... args){
        PApplet.main("ProcessingDemo");
    }

    @Override
    public void settings() {
        super.settings();
        size(640,488);
    }

    @Override
    public void setup() {
        super.setup();
//        ellipse(200,200,300,400);
    }

    @Override
    public void draw() {
        ellipse(mouseX,mouseY,300,400);
    }
}