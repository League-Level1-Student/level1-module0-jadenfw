int fall = 0;
int x = (int) random(width);
void setup()
{
 size(600,600);
 background(0,0,50);
}

void draw()
{
  
  background(0,0,50);
  fill(0,0,255);
  stroke(0,0,255);
  ellipse(x, fall, 2, 20);
  fall = fall + 2;
  if(fall == 600)
  {
   fall = 0; 
   x = (int) random(width);
  }
}
