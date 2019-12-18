
void setup() {
 size(2000,1000);

PImage zombie = loadImage("ZOMBIE.jpg");
 zombie.resize(width,height);
image(zombie, 0, 0);

}
void draw() {
  fill(mouseX, mouseY,100);
  ellipse(1350,200,110,100);
  ellipse(1500,250,110,100);
 
 // ellipse(1350,200,55,50);
   
  

}
