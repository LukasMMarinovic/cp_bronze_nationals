import java.awt.*;
import java.applet.*;


class Building
{
   private int x;
   private int y;
   private int width;
   private int height;
   
   public Building(Graphics g, int max, int min, int width, int height)
   {
      x = (int) ((Math.random() * (max - min)) + min);
      y = (int) ((Math.random() * (300 - 100)) + 100);
      this.width = width;
      this.height = height;
      g.setColor(Primitives.randColor());
      g.fillRect(x, y, this.width, this.height);   
   }
   
   public int get_x() {return x;}
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
   
   public CustomBuild(Graphics g, int max, int min, int width, int height)
   {
      super(g, max, min, width, height);
   }
   
   public void addPatio(Graphics g, int elevation)
   {  
      g.setColor(new Color(0,0,0));
      g.fillRect((get_x() + get_width()), (get_y() - elevation), 50, 100);
   }
   
   public void addTop(Graphics g, int exceed, int height)
   {
      int holderx = get_x();
      int holdery = get_y();
            
      g.setColor(Primitives.randColor());
      g.fillRect(holderx + exceed, holdery - height, get_width() - exceed*2, height);
   }
   
   public void addSteeple(Graphics g, int k, int factor)
   {      
      int slack = 5;
      for(int i = 1; i <= k; i++)
      {
         addTop(g, slack, 5*i*factor);
         slack += 3;
      }
   }
   
   public void addWaterTower(Graphics g, int exceedx, int exceedy, int margin)
   {
      int tempx = get_x() + exceedx;
      int tempy = get_y() - exceedy; 
      
      int rany = (int)((Math.random() * (35 - 19)) + 19);
      int ranx = (int) ((Math.random() * (30 - 15)) + 15);
      
      g.setColor(Primitives.randColor());
      //legs
      g.fillRect(tempx + margin, tempy + rany, 3, 10);
      g.fillRect(tempx + margin + (ranx / 2), tempy + rany, 3, 10);
      //body
      g.fillRect(tempx, tempy, ranx, rany);
      //top
      Polygon top = new Polygon();
      top.addPoint(tempx, tempy);
      top.addPoint(tempx + ranx, tempy);
      top.addPoint(tempx + (ranx / 2), tempy - (ranx / 2));
      g.fillPolygon(top);      
   }
   
   public void addAnt(Graphics g, int length) 
   {
      g.setColor(Primitives.randColor());
      g.fillRect(get_x()+ (get_x()/3), get_y()-length, 2, length);
   }
}


//Creates acutal city skyline
class CityLine
{
   public CityLine(Graphics g)
   {
   
   int type, width, height, padd;
   CustomBuild cs;
   
   for(int i = 0; i <= 5; i++)
      {
         type = (int)((Math.random()*(3-1)) + 1);         
         padd = (int)((Math.random() * (300-100)) + 100);
         System.out.println(padd);
         switch(type)
         {
            case 1:
               width = ((int)Math.random()) + 100; 
               height = ((int)Math.random()) + 250;               
               int ran_fac = (int) ((Math.random()*(5-2)) + 2);            
               cs = new CustomBuild(g, 500+padd, 100, width, height);
               cs.addSteeple(g,4,ran_fac);
               while(cs.get_x() < 0)
               {
                  
               } 
            case 2:
               width = ((int)Math.random()) + 100; 
               height = ((int)Math.random()) + 250;
               cs = new CustomBuild(g, 200+padd, 100, width, height);
               
            case 3:
               width = ((int)Math.random()) + 100; 
               height = ((int)Math.random()) + 250;
               cs = new CustomBuild(g, 350+padd, 100, width, height);
         }
      }
   } 
}