import java.awt.*;
import java.applet.*;


class Building
{
   private int x;
   private int y;
   private int width;
   private int height;
   
   public Building(Graphics g, int max, int min)
   {
      x = (int) ((Math.random() * (max - min)) + min);
      y = (int) ((Math.random() * (max - min)) + min);
      Graphics g = new Graphics();
      g.setColor(new Color(0,0,0));
      g.fillRect(x, y, );   
   }
   
   public int get_x() {return x;)
   public int get_y() {return y;}
   public int get_width() {return width;}
   public int get_height() {return height;}
   
   public void set_x(int x) {this.x = x;}
   public void set_y(int y) {this.y = y;}
   public void set_width(int width) {this.width = width;}
   public void set_height(int height) {this.height = height;}
   
}

class CustomBuild extends Building
{
   public CustomBuild()
   {
            
   }
   
   public void addPatio(Graphics g, int elevation)
   {  
      g.setColor(new Color(0,0,0));
      g.fillRect((x + width), (y - elevation), 50, 100);
   }
   
   public void addTop(Graphics g, int exceed, int self_height)
   {
      g.setColor(new Color(0,0,0));
      g.fillRect((x + exceed), y, (width - 30), self_height);
      g.fillRect((x + exceed + 10), y, 3, 10);
   }
}