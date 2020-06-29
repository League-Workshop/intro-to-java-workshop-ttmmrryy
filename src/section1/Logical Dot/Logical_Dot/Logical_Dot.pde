int x = 300;
int speed = 4;
int y = 300;
int speed2 = 5;

void setup() {
  size(600, 600);
  textSize(30);
  noStroke();
}

void draw() {

  if(mousePressed) {
      x = x + speed;
      y = y + speed2;
      background(#2D00FF);
      fill(#FF0000);
      text("I SAID DONT HOLD THE BUTTON", 70, 90);
  }
  else {
      background(#FF0000);
      fill(#2D00FF); 
      text("Don't hold the button", 150, 90);
  }
  
  if(x > 600){
    speed = -speed;
  }
  
  if(x < 0){
    speed = -speed;
  }
  
  if(y > 600){
    speed2 = -speed2;
  }
  
  if(y < 0){
    speed2 = -speed2;
  }
  
  ellipse(x, y, 400, 400);
  fill(#FFFFFF);
}
