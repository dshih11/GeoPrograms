public class A6_IfThen extends World {

    public int randNum;
    public int randomBlue;
    public int randomRed;
    public int randomGreen;
    public int randomX;
    public int randomY;



    public void go() {
        randomBlue = plane.random(0,255);
        randomRed = plane.random(0, 255);
        randomGreen = plane.random(0, 255);
        randomX = plane.random(0,500);
        randomY = plane.random(0,300);

        plane.hasTrail = true;
        plane.pausetime = 2 ;
        plane.teleport(350, 400);

        randNum = plane.random(0, 4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            rectangle(200, 100);
        }
        if (randNum == 2) {
            rectangle(60, 100);
        }
        if (randNum == 3){
            star();
        }
    }

    public void square() {
       plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.setAngle(90);
        plane.teleport(randomX, randomY);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }

    public void rectangle(int a, int b) {
        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.setAngle(90);
        plane.teleport(randomX, randomY);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    }//end of rectangle
    public void star() {
        plane.pausetime = 1;
        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.setAngle(90);
        plane.teleport(randomX, randomY);
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
        plane.turnLeft(145);
        plane.move(325);
        plane.turnLeft(156);
        plane.move(325);
    }
    //todo: add a method to the file. you can copy and paste an old one or make a new one
}//end of file



