package main.homework.day1.basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse) {
        System.out.println(mouse.getName());
        System.out.println(mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce) {
        System.out.println(souce.getName());
        System.out.println(souce.getColor());
        souce.printSouceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println(bee.getGender());
        System.out.println(bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println(obstacle.getDescription());
        System.out.println(obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.getHeatCapacity());
        System.out.println(pineapple.getGrade());
        pineapple.printPineappleDetails();
    }
}

