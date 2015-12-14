import java.awt.*;
import java.applet.*;
import java.util.*; 

class background
{
   private static Color getDetermine()
   {
      int hour;
      Color sky;
      
      Date date = new Date();
      Calendar calendar = GregorianCalendar.getInstance();
      calendar.setTime(date);
      hour = calendar.get(Calendar.HOUR_OF_DAY);
      
      if(hour >= 18 || hour <= 6) //night
      {
         sky = new Color(44, 62, 80);
         return sky;
      }
      else if(hour >= 6 || hour <= 11)//sunset/rise
      {
         sky = new Color(230, 126, 34);
         return sky;
      }
      else if(hour >= 11 || hour <= 13)//midday
      {
         sky = new Color(52, 152, 219);
         return sky;
      }
      else//default
      {
         sky = new Color(255,245,150);
         return sky;
      }
   }

   public static void Background(Graphics g)
   {
      
      g.setColor(getDetermine());
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