public class GHImage extends World{

  public int randNum;
    public void go(){
        plane.hasTrail = true;
        plane.pausetime= 0;
        plane.trailWidth = 5;
        //if statement
        randNum = plane.random (0, 4);
        if (randNum == 0){
            plane.setTrailColor(255, 0, 0 );
        }
        if (randNum == 1){
            plane.setTrailColor(0, 255, 0);
        }
        if (randNum == 2){
            plane.setTrailColor(0, 0, 200);
        }//end of if statement

        //for loop
        for(int x=0; x<5; x++){
            plane.teleport(x*200, 100 );
            uphouse();//calling of method
        }//end of for loop
        plane.setAngle(0);
        plane.teleport(1, 360);
        plane.setTrailColor(13, 13, 12);
        plane.move(1000);
        plane.teleport(1, 420);
        plane.setTrailColor(252, 198, 3);
        plane.move(1000);
        plane.teleport(1, 480);
        plane.setTrailColor(13, 13, 12);
        plane.move(1000);

        for(int y=0; y<5; y++){
            plane.teleport(1000-(y*200), 540);
            downhouse();
        }

    }//end of go

    //definition of method
    public void uphouse(){
       plane.setAngle(90);
        plane.move (200);
        plane.turnLeft(90);
        plane.move (200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(45);
        plane.move(141);
        plane.turnLeft(90);
        plane.move(141);
    }
    public void downhouse(){
        plane.setAngle(90);
        plane.move(200);
        plane.turnLeft(-45);
        plane.move(141);
        plane.turnLeft(-90);
        plane.move(141);
        plane.turnLeft(-45);
        plane.move(200);
        plane.turnLeft(-90);
        plane.move(200);
    }
}//end of file
