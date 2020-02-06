void setup()
{
  size(600, 600);
  background(255, 255, 255);
}
int worm = 5;
void draw()
{
  
  makeMagical();
  if (mousePressed)
  {
    worm++;
  }
  
 
  for (int i = 0; i < worm; i++) 
  {
    float x = random(595);
    float y = random(595);
    fill(255,0,0);
    
    ellipse(getWormX(i),getWormY(i), 10,10);
    }
  }

 float frequency = .006;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 255, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
