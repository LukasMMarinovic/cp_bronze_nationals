import java.awt.*;
import java.applet.*;

class Window 
{
public static void drawwindow(Graphics g)

{
   g.setColor(new Color(79,79,79));
   //draw left edge
   g.fillRect(0,0,100,500);
   //draw right edge
   g.fillRect(900,0,1000,500);
   //draw bottom
   g.fillRect(0,330,1000,500);
   //draw top
   g.fillRect(0,0,1000,80);
   
   
   //top left corner
   Polygon tl = new Polygon();
   tl.addPoint(100,80);
   tl.addPoint(160,80);
   tl.addPoint(140,85);
   tl.addPoint(105,120);
   tl.addPoint(100,140);
   g.fillPolygon(tl);
   
   //top right corner
   Polygon tr = new Polygon();
   tr.addPoint(840,80);
   tr.addPoint(900,80);
   tr.addPoint(900,140);
   tr.addPoint(895,120);
   tr.addPoint(860,85);
   g.fillPolygon(tr);
   
   //bottom left corner
   Polygon bl = new Polygon();
   bl.addPoint(100,330);
   bl.addPoint(160,330);
   bl.addPoint(140,325);
   bl.addPoint(105,290);
   bl.addPoint(100,270);
   g.fillPolygon(bl);
   
   //bottom right corner
   Polygon br = new Polygon();
   br.addPoint(900,330);
   br.addPoint(840,330);
   br.addPoint(860,325);
   br.addPoint(895,290);
   br.addPoint(900,270);
   g.fillPolygon(br);
   
   //draw floor
   g.setColor(new Color(110,110,110));
   g.fillRect(0,460,1000,500);
}
}
