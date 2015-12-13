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

/*
   note about how much this class sucks and proposal for new teaching strats 
   
*/


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
   Subway.drawSubway(g);
   

   
   /*CustomBuild cus = new CustomBuild(g, 300, 200);
   cus.addTop(g, 10, 30);
   repaint();
   try
      {
         Thread.sleep(100);
      }
   catch(Exception ex)*/
      {
      }
   } 
   
}