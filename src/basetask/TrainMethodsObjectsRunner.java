package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processMouse(new Mouse("Мая", 7));
        trainMethodsObjects.processSouce(new Souce("горчица", "желтого"));
        trainMethodsObjects.processBee(new Bee("male", 5L));
        trainMethodsObjects.processObstacle(new Obstacle("серьезное", "не знаю как писать автотесты"));
        trainMethodsObjects.processPineapple(new Pineapple("желтый", 21f));
    }
}
