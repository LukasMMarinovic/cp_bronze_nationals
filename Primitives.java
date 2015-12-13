//Contains Prime_methods
import java.awt.*;
import java.applet.*;

class Primitives
{
   public static Color randColor()
   {
      int r = (int)((Math.random()*(54-18))+18);
      Color temp = new Color(r,r,r);
      return temp;
   }
}