//|=======================}//
//| Lab10vst.java         |//
//|                       |//
//| This program displays |//
//| a scene using Java    |//
//| graphics...again      |//
//|                   bleh|//
//|=======================|//

//|=================================================|//
//|Scratch-A-Bear inc.                              |//
//|                                                 |//
//|please visit:                                    |//
//|      http://www.scratch-a-bear.edu              |//
//|                                                 |//
//|Developers:                                      |//
//|      Vijaysrinivas Rajagopal                    |//
//|         https://github.com/MedicAlert           |//
//|      Lukas Marinovic                            |//
//|         https://github.com/LukasMMarinovic      |//
//|      Alejandro Scroggs                          |//
//|         https://github.com/handroishonda        |//
//|=================================================|//


import java.awt.*;
import java.applet.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Lab10vst extends Applet
{
  public void init()
  {  
  //play music
   try
   {
      AudioInputStream audioInputStream =
      AudioSystem.getAudioInputStream(
      this.getClass().getResource("jazzinparis.wav"));
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
   }
   catch(Exception ex)
   {   
   }
  try
  {
      AudioInputStream audioInputStream =
      AudioSystem.getAudioInputStream(
      this.getClass().getResource("subway.wav"));
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
   }
   catch(Exception ex)
   {  
   }            
  }
   public void update(Graphics g)
   {
   paint(g); 
   }        
   public void paint(Graphics g)
   { 
   //Draw components
   setSize(1000,500);
   background.Background(g);
   CityLine cs = new CityLine(g);
   Subway.drawSubway(g);
   
   repaint();
   try
      {
         Thread.sleep(100);
      }
   catch(Exception ex)
      {
      }
   } 
   
}