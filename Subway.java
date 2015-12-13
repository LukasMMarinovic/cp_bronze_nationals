import java.awt.*;
import java.applet.*;

class Subway
{
   public static void drawSubway(Graphics g)
   {
      //draws all subway components
      Window.drawwindow(g);
      Bench.drawBench(g);
      Details.drawPole(g);
      Ads.drawOriginalJokes(g);
   }
}


class Ads
{
public static void drawOriginalJokes(Graphics g)
{
   g.setColor(new Color(245,245,245));        //newspaper background
   g.fillRect(290,30,150,43);

   int fontSize = 15;
   g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));   //actual word "wanted"
   g.setColor(new Color(110,110,110));
   g.drawString("WANTED: ",295,45);
    
   fontSize = 4;
   g.setFont(new Font("TimesRoman",Font.PLAIN, fontSize));     //illegible text
   g.drawString("lukas is a stupid poopoo loser",300,52);
   g.drawString("vijay sucks fat juicy hairy dongs",300,56);
   g.drawString("vijay and lukas sitting in a tree",300,60);
   g.drawString("F U C K I N G, cuz they are gay",300,64);
   g.drawString("first comes love, then STD's",300,68);
   g.drawString("then comes Handro with a big peepee",300,72);
   
   
}

}
class Details
{
   public static void drawPole(Graphics g)
   {
      //draws poles
      g.setColor(new Color(130,130,130));
      g.fillRect(50,10,12,480);
      g.setColor(new Color(200,200,200));
      g.fillRect(50,10,3,480);
      
      g.setColor(new Color(130,130,130));
      g.fillRect(950,10,12,480);
      g.setColor(new Color(200,200,200));
      g.fillRect(950,10,3,480);


      //ad ceiling hook things...maybe...if time permits
   }

}
class Bench
{
   public static void drawBench(Graphics g)
   {
      //draws a bench
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
      
      //draw floor/ceiling
      g.setColor(new Color(110,110,110));
      g.fillRect(0,460,1000,500);
      g.fillRect(0,0,1000,25);
   
   }

}