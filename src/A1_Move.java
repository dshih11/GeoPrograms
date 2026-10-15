public class A1_Move extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 1 ;
        plane.setAngle(90);
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

}

