//Note: Applets are now deprecated. Ask your university to update syllabus.

import java.awt.*;
import java.applet.*;

public class B8_Graphics_Class_Methods extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawLine(20, 20, 100, 100);
        g.drawRect(125,125,175,175);
        g.fillRect(76,160,175,195);
        g.fillRoundRect(120, 20, 60, 60, 25, 25);
        g.setColor(Color.GREEN);
        g.draw3DRect(25,20,60,60,true);
        g.setColor(Color.BLUE);
        g.drawOval(200,30,100,60);
        g.fillOval(300,30,100,30);
        g.drawArc(100, 100, 80, 60, 45, 120);
        g.fillArc(450, 50, 80, 60, 45, 120);
        g.drawString("Hello there",200,200);

    }
}
