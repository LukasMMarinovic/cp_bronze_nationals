import java.awt.*;
import java.applet.*;

class background
{
   public static void Background(Graphics g)
   {
      g.setColor(new Color(255,144,84));
      g.fillRect(0,0,1000,500);
      
      
      
      
      g.setColor(new Color(255,144,84));   ///need to make this random and flicker
      for(int x=0; x<200; x++)
      {
         g.setColor(new Color(255,245,150));
         
         int xc = (int)(Math.random() * 1000) + 0;
         int yc = (int)(Math.random() * 500) + 0;

         g.fillRect(xc,yc,1,1);
      } 
  
   }
   
}