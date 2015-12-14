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
      Ads.drawAds(g);
   }
}

class Ads
{
public static void drawAds(Graphics g)
{
      //this is composition v
      Ad1.drawOriginalJokes(g);
      Ad2.drawSecondOriginalJoke(g);
}
}
class Ad1
{
public static void drawOriginalJokes(Graphics g)
{
   g.setColor(new Color(245,245,245));        //newspaper background
   g.fillRect(290,30,150,43);

   int fontSize = 19;
   g.setFont(new Font("Stencil", Font.PLAIN, fontSize));   //actual word "wanted"
   g.setColor(new Color(110,110,110));
   g.drawString("WANTED: ",295,45);
    
   fontSize = 4;
   g.setFont(new Font("Stencil", Font.PLAIN, fontSize));    
   g.drawString("vijay loooooves to listen to adele",295,52);      //illegible text
   g.drawString("lukas marinovic likes romantic comedies",295,56);
   g.drawString("vijay and lukas sitting in a tree",295,60);
   g.drawString("i want new lab partners pretty please",295,64);
   g.drawString("does't appreciate our really dank humor",295,68);
   g.drawString("GG we win we get a 100 on the lab grade",295,72);
   
   fontSize = 38;
   g.setFont(new Font("Stencil", Font.PLAIN, fontSize));   //wanted semicolon
   g.drawString(";",410,60);
   g.setColor(new Color(120,120,120));         //box around the suspect
   g.drawRect(395,33,40,36);
  
}
}
class Ad2
{
public static void drawSecondOriginalJoke(Graphics g)
{
   g.setColor(new Color(120,120,120));
   g.fillRect(560,30,235,45);                //java cafe background
   
   int fontSize = 12;
   g.setColor(new Color(225,245,245));
   g.setFont(new Font("ComicSansMC", Font.PLAIN, fontSize));
   g.drawString("Do you want a method to get out of class?",565,45);
   g.drawString("COME TO THE JAVA CAFE!",600,67);
   
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