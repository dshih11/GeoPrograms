public class A3_Color extends World {

    //variables
    public int randomBlue;
    public int randomRed;
    public int randomGreen;
    public int randomWidth;

    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.trailWidth = 10;


        //add value to the variable
        randomBlue = plane.random(0, 255);
        randomRed = plane.random(0, 255);
        randomGreen = plane.random(0, 255);
        randomWidth  = plane.random (1, 80);

        star ();

        // r = red, g = green, b = blue
        // values have to be between 0-255


    } //end of go


    public void square() {
        plane.setTrailColor(randomRed, 0,randomBlue);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);


    } //end of square

     public void star() {
         plane.pausetime = 1 ;
         plane.setAngle(90);
         plane.setTrailColor(randomRed, randomGreen, randomBlue);
         plane.trailWidth = randomWidth;
         plane.hasTrail = false;
         plane.move(400);
         plane.hasTrail = true;
         plane.turnLeft(135);
         plane.move(650);
         plane.hasTrail = true;
         plane.turnLeft(135);
         plane.move(650);
         plane.turnLeft(135);
         plane.move(650);
         plane.turnLeft(145) ;
         plane.move(650);
         plane.turnLeft(156);
         plane.move(650);
     }


} //end of file
