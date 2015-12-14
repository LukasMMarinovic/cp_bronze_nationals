import java.awt.*;
import java.applet.*;

class PeopleOnDaSubway
{
   public static void sittingBull(Graphics g)    //this is the sitting person
   {
      Polygon sittingBull = new Polygon();
   }
   
   public static void standingGuy(Graphics g)    //this is the standing guy
   {
      g.setColor(new Color(10,10,10));
      Polygon standingGuy = new Polygon();
      standingGuy.addPoint(80,490);
      standingGuy.addPoint(160,490);
      standingGuy.addPoint(172,350);
      standingGuy.addPoint(200,330);
      standingGuy.addPoint(170,240);
      standingGuy.addPoint(185,210);
      standingGuy.addPoint(193,195);
      standingGuy.addPoint(185,160);
      standingGuy.addPoint(125,142);
      standingGuy.addPoint(115,175);
      standingGuy.addPoint(118,195);
      standingGuy.addPoint(90,110);
      standingGuy.addPoint(62,95);
      standingGuy.addPoint(62,115);
      standingGuy.addPoint(75,125);
      standingGuy.addPoint(82,190);
      standingGuy.addPoint(95,250);
      g.fillPolygon(standingGuy);
      
   }
}