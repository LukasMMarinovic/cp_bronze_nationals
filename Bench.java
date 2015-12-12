import java.awt.*;
import java.applet.*;

class Bench
{
public static void drawBench(Graphics g)
{
   g.setColor(new Color(110,110,110));
   Polygon benchback = new Polygon();
   benchback.addPoint(160,310);
   benchback.addPoint(840,310);
   benchback.addPoint(870,420);
   benchback.addPoint(130,420);
   g.fillPolygon(benchback);
   
   g.setColor(new Color(90,90,90));
   g.fillRect(130,407,740,8);
   g.setColor(new Color(130,130,130));
   g.fillRect(128,415,744,18);
   g.setColor(new Color(60,60,60));
   g.fillRect(148,433,704,35);
}
}