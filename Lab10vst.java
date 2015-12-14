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
> A little note to our loveley computer science teacher:

>     First off, it’s important to note that this isn’t some sort of hate rant.
 It’s because we care, and you are one of our favorite teachers. There are really 
 only two types of students that take this class; those who wish to learn java and 
 have fun and those who just want an easy AP class in which they don’t have to put
  in too much effort into. After speaking with each other, other APCS students and 
  former APCS students of the first kind, we have discovered that there is a pretty
   similar trend. This class only benefits the ones who want an easy grade, and
    those who actually enjoy programming and wish to learn something get nothing
     out of it. Every class is just full of quizzes and listening to the endless
      chapters we read the previous night. Everything just goes in one ear and shoots 
      out the other. For every lab or frq we sit down to do, we realize that we don’t
       know how to code at all. Don’t believe me? Try asking your students to write a
        switch statement. This could have been prevented. Not only that, you could have
         a lot more 5s on the AP exams from your students, and children who can write
          better code. We aren’t given the chance to mess up and learn. Reading
           a program does not have as much of an effect on the student as physically
            writing a program from scratch. Additionally, a textbook is just a
             resource, and if all we wanted was a book, we could have gone and
              bought a book that was better than the one we use. To add to that,
               Concepts in this book are way harder over-simplified, and easy
                concepts are explained in too much detail. There is a reason we took
                 the class as opposed to just purchasing a book. The model you used
                  last year for teaching class was much more effective, and we feel
                   as if a modified version would be beneficial to this class. Last
                    year you taught a basic concept, we wrote a simple program using
                     the concept, you added onto the concept, and we wrote programs
                      that utilized the expanded bits. /AFTER/ we learned everything,
                       and the lesson was pounded into our heads, we were tested on it.
                        It would be really nice if our classes were organized in a 
                        similar fashion with more hands-on coding practice, and
                         quizzes/tests when we were sure we knew everything. During
                          class, we don’t ignore the lesson because we don’t car or
                           because we wish to be rude, but it’s that they are boring,
                            and we get very little from them Again this wasn’t meant
                             to be rude in any sense. It’s just that this class has a 
                             lot of potential, and it could be something amazing. We
                              know you try really hard, and this would require more 
                              effort, but I think we can all agree that these changes
                               will be well worth it. Again, thank you, and if you want,
                                you can talk to us in person about this.



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