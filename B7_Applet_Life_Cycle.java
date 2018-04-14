import java.applet.*;
import java.awt.*;

public class B7_Applet_Life_Cycle extends Applet {
    public void init() {
        System.out.println("init() method execution");
    }
    public void start() {
        System.out.println("start() method execution");
    }
    public void paint(Graphics g) {
        g.drawString("Applet Life Cycle", 100, 100);
    }
    public void destroy() {
        System.out.println("destroy() method execution");
    }
}