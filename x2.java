//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Whoever Whoever  (CST 112; today's date?)

//////// Please change these to your name and today's date.
String author=  "Whoever Whatever";
String title=  " ??? ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  scene();
  hero();
  dog();
  messages();
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
background( 0,78,242 );                // sky
  fill( 247,124,0 );
  ellipse( width*3/4, height/10, 100,100 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  // HOUSE
  fill(255,0,47);
  rect(150, 65, 55, 55);
  fill(0,255,236);
  triangle(150, 65, 178, 10, 206, 65);
  fill(0);
  rect(187, 90, 15, 30);
  
  
   
  fill( 103,44,9 );
  rect(38, 60, 25, 60);              // tree fixed
  fill( 100,200,100 );
  triangle(30, 75, 58, 20, 86, 75);
  triangle(20, 65, 48, 10, 76, 65); 
  triangle(40, 85, 68, 30, 96, 85);
  triangle(5, 85, 38, 30, 66, 85);
}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "[[[[ Zoog. ]]]]", 200, 200 );
  rect( x,y, 50,80 );
}
void dog() {
  dogX=  dogX - (dogX-x)/30;
  dogY=  dogY - (dogY-y)/40;
  text( dogX, 10, 10 );
  text( dogY, 10, 20 );
  //
  fill( 150,0,0 );
  rect(dogX,dogY, 60,30 );
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!d!!", 150, 150 );
  

  line( dogX, dogY+30, dogX+20, dogY+30+20);
}





//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
  /* INSERT YOUR CODE HERE! */
}
   
   

