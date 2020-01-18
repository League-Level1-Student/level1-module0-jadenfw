import ddf.minim.*;
PImage Record;
int spin = 1;
Minim minim;        
 AudioPlayer song;
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
void setup()
{
  minim = new Minim(this);
  song = minim.loadFile("awesomeTrack.mp3", 512);
  size(600,600);
  Record = loadImage("record.png");
  Record.resize(300,300);
}

void draw()
{

  if(mousePressed)
  {
    song.play();
  rotateImage(Record, spin);
  spin = spin +44;
  image(Record, 0, 0);
  }
  else
  {
   song.pause(); 
  }
  
}
