Die square;
int reference;

void setup()
{  
  size(450, 450);
  noLoop();
  textAlign(CENTER);
}                                                                                                                                                        
void draw()
{
  background(0);
  for (int y=100; y<=300; y+=100)
  {
    for (int x=100; x<=300; x+=100)
    {
      square = new Die(x, y);
      square.roll();
      square.show();
    }
  }


  
}
void mousePressed() 
{
	redraw();
}

class Die //models one single dice cube
{
  int numDots, myX, myY;
  Die(int x, int y) //constructor
  {
    numDots =(int)((Math.random()*7)+1);
    myX=x;
    myY=y;
  }
  void roll()
  { 
    //your code here
  }
  void show()
  {  
    fill(255); 
    rect(myX, myY, 50, 50);
    //   fill(0);
    //     if (numDots==1)
    //   {
    //     ellipse(10,10)
    //   };
    //     if (numDots==2)
    //   {
    //     ellipse(10,10)
    //   };
    //     if (numDots==3)
    //   {
    //     ellipse(10,10)
    //   };
    //     if (numDots==4)
    //   {
    //     ellipse(10,10)
    //   };
    //     if (numDots==5)
    //   {
    //     ellipse(10,10)
    //   };
    //     if (numDots==6)
    //   {
    //     ellipse(10,10)
    //   };
  }
}
