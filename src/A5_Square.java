public class A5_Square extends World {

    //variables
    public int randomBlue;
    public int randomRed;
    public int randomGreen;
    public int randomWidth;

    public void go() {
        randomBlue = plane.random(0, 255);
        randomRed = plane.random(0, 255);
        randomGreen = plane.random(0, 255);
        randomWidth  = plane.random (1, 80);

        plane.trailWidth = 5;
        plane.pausetime = 3;
        plane.setTrailColor(randomRed , randomGreen , randomBlue);

        plane.setAngle(90);
         square(100);
        plane.teleport(200, 312);
        bigSquare();
        plane.teleport (571, 579);
        star();
        plane.teleport(400, 579);
        triangle();
    }

    //parameter types of variable that live in the parenthesis of methods
    //they can only be used in the method
    //data type = type of information stored inside of a variable ex: 2 or true
    //variables with answer of a number = integer
    //variables with answer true/false = boolean
    public void square(int size) {
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move (size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        // notice the direction your plane is facing at this point
    }

    public void bigSquare () {
        plane.setAngle(0);
        plane.hasTrail = true;
        plane.trailWidth = 5;
        plane.teleport (271, 727);
        plane.move(500);
        plane.turnLeft(90);
        plane.move(500);
        plane.turnLeft(90);
        plane.move(500);
        plane.turnLeft(90);
        plane.move(500);
        plane.turnLeft(90);
    }

    //todo: make 2 more squares using the square method that are different sizes

    public void star() {
        plane.pausetime = 1 ;
        plane.setAngle(90);
        plane.setTrailColor(200, 100,70);
        plane.trailWidth = 5;
        plane.hasTrail = false;
        plane.move(200);
        plane.hasTrail = true;
        plane.turnLeft(135);
        plane.move(325);
        plane.hasTrail = true;
        plane.turnLeft(135);
        plane.move(325);
        plane.turnLeft(135);
        plane.move(325);
        plane.turnLeft(145) ;
        plane.move(325);
        plane.turnLeft(156);
        plane.move(325);
    }

    public void triangle() {
        plane.move (100);
        plane.turnLeft(120);
        plane.move(100);
        plane.turnLeft(120);
        plane.move(100);
        plane.turnLeft(120);
    }
}


