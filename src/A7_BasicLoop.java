public class A7_BasicLoop extends World {

    public int randomBlue;
    public int randomRed;
    public int randomGreen;
    public int randomX;
    public int randomY;
    public int randomNum;
    public void square(){

        for(int y=0; y<4; y++){;
            plane.move(50);
            plane.turnLeft(90);
            //todo: draw a square using only 2 lines of code

        }//end of for

    }//end of square
    public void go() {
           for (int f = 0; f < 10; f++) {
               for (int x = 0; x < 10; x++) {
                   plane.hasTrail = true;
                   plane.trailWidth = 30;
                   plane.pausetime = 0;
                   plane.teleport(100 * x, 2 * f * 40);
                   //todo: make the color change from left ot right and up to down
                   plane.setTrailColor(2 * 10 * f, 2*5*f, 3*5*x);
                   square();
               }//end of for #1
//            for (int y = 0; y < 10; y++) {
//                plane.hasTrail = true;
//                plane.trailWidth = 3;
//                plane.pausetime = 1;
//                plane.teleport(y * 100, 300);
//                square();
//            }//end of for #2
//            for (int z = 0; z < 10; z++) {
//                plane.hasTrail = true;
//                plane.trailWidth = 3;
//                plane.pausetime = 1;
//                plane.teleport(z * 100, 500);
//                square();
//            }//end of for #3
//            for (int a = 0; a < 10; a++) {
//                plane.hasTrail = true;
//                plane.trailWidth = 3;
//                plane.pausetime = 1;
//                plane.teleport(a * 100, 700);
//                square();
               // }//end of for #4
           }//end of outer for loop

//        randomBlue = plane.random (0, 255);
//        randomGreen = plane.random (0, 255);
//        randomRed = plane.random (0, 255);
//        randomX = plane.random (200, 300);
//        randomY = plane.random (200, 300);


        //todo: make a method and name it "square"


        // todo:make a loop that loops 4 times

//        for(int x=0; x<12; x=x+1){
//            randomNum = plane.random (0, 12);
//            System.out.println("x: " + x);
//
//        }
//        if(randomNum == 0); {
//            plane.setTrailColor(randomRed, randomGreen, randomBlue);
//            plane.teleport(randomX, randomY);
//            plane.square(100);
//        }
//        if(randomNum == 1); {
//            plane.setTrailColor(randomBlue, randomGreen, randomRed);
//            plane.teleport(randomY, randomX);
//            plane.square(50);
//        }
//        if(randomNum ==2);{
//            plane.setTrailColor(randomGreen, randomRed, randomBlue);
//            plane.teleport(randomX, randomX);
//            plane.square(150);
//        }
//        if(randomNum ==3);{
//            plane.setTrailColor(randomBlue, randomBlue, randomRed);
//            plane.teleport(randomY, randomY);
//            plane.square(200);
//        }
//        if(randomNum ==4);{
//            plane.setTrailColor(randomBlue, randomGreen, randomBlue);
//            plane.teleport(randomX+100, randomY+100);
//            plane.square(250);
//        }
//        if(randomNum ==5);{
//            plane.setTrailColor(randomGreen, randomGreen, randomRed);
//            plane.teleport(randomY+100, randomX+100);
//            plane.square(300);
//        }
//        if(randomNum ==6);{
//            plane.setTrailColor(randomBlue, randomGreen, randomGreen);
//            plane.teleport(randomX+200, randomY+200);
//            plane.square(350);
//        }
//        if(randomNum ==7);{
//            plane.setTrailColor(randomBlue, randomRed, randomRed);
//            plane.teleport(randomY+200, randomX+200);
//            plane.square(400);
//        }
//        if(randomNum ==8);{
//            plane.setTrailColor(randomRed, randomGreen, randomRed);
//            plane.teleport(randomX+300, randomY+300);
//            plane.square(450);
//        }
//        if(randomNum ==9);{
//            plane.setTrailColor(randomGreen, randomBlue, randomRed);
//            plane.teleport(randomY+300, randomX+300);
//            plane.square(500);
//        }
//        if(randomNum ==10);{
//            plane.setTrailColor(randomBlue, randomRed, randomGreen);
//            plane.teleport(randomX+400, randomY+400);
//            plane.square(550);
//        }
//        if(randomNum ==11);{
//            plane.setTrailColor(randomRed, randomBlue, randomGreen);
//            plane.teleport(randomY+400, randomX+400);
//            plane.square(600);
//        }


    }//end of go
}
//"int x=0" = variable declaration
//"x<5" = if statement/conditional question
//"x=x+1" = increment

//for(int x=0; x<12; x=x+1) {
 //make a row of squares using teleport
 //plane.setPosition(100, 100);
 //plane.teleport(100 , x*100+100);
 //plane.setTrailColor(randomRed, randomGreen, randomBlue) ;
 //System.out.println("x: " + x);
// plane.square(100);
