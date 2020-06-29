PImage mustache;
PImage friend;
PImage hat;
void setup() {
  friend = loadImage("face.jpg");
  size(800, 600);
  friend.resize(width, height);
  mustache = loadImage("mustache.jpg");
  mustache.resize(200, 100);
  hat = loadImage("hat.png");
  hat.resize(500, 250);
  background(friend);
}

void draw() {

  if(mouseButton == LEFT) {
    background(friend);
    image(mustache, mouseX, mouseY);
  }
  if(mouseButton == RIGHT) {
    background(friend);
    image(hat, mouseX, mouseY - 5);
  }
}
