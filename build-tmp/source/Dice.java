import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die square;
int reference;


public void setup()
{  
  size(450, 450);
  noLoop();
  textAlign(CENTER);
}                                                                                                                                                        
public void draw()
{ int sum =0;
  background(143,154,210);
  for (int y=100; y<=300; y+=100)
  {
    for (int x=100; x<=300; x+=100)
    {
      square = new Die(x, y);
      square.roll();
      square.show();
      sum=sum + square.numDots;
    }
  }

  textSize(20);
  fill(0);
  text("Total Sum equals: " + sum, 200,400);


  
}
public void mousePressed() 
{
	redraw();
}

class Die //models one single dice cube
{
  int numDots, myX, myY;
  Die(int x, int y) //constructor
  {
    numDots = (int)((Math.random()*6)+1);
    myX=x;
    myY=y;
  }
  public void roll()
  { 
    //your code here
  }
  public void show()
  {  
    fill(255); 
    rect(myX, myY, 50, 50);
      fill(0);
         if (numDots==1)
      {
        ellipse(myX+25,myY+25,10,10);
      }
        if (numDots==2)
      {
        ellipse(myX+13,myY+13,10,10);
        ellipse(myX+38,myY+38,10,10);
      }
        if (numDots==3)
      {
        ellipse(myX+13,myY+13,10,10);
        ellipse(myX+25,myY+25,10,10);
        ellipse(myX+38,myY+38,10,10);
      }
        if (numDots==4)
      {
        ellipse(myX+13,myY+13,10,10);
        ellipse(myX+38,myY+38,10,10);
        ellipse(myX+13,myY+38,10,10);
        ellipse(myX+38,myY+13,10,10);
      }
        if (numDots==5)
      {
        ellipse(myX+13,myY+13,10,10);
        ellipse(myX+38,myY+38,10,10);
        ellipse(myX+25,myY+25,10,10);
        ellipse(myX+13,myY+38,10,10);
        ellipse(myX+38,myY+13,10,10);
      }
        if (numDots==6)
      {
        ellipse(myX+13,myY+13,10,10);
        ellipse(myX+38,myY+38,10,10);
        ellipse(myX+13,myY+25,10,10);
        ellipse(myX+38,myY+25,10,10);
        ellipse(myX+13,myY+38,10,10);
        ellipse(myX+38,myY+13,10,10);
      }

  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
