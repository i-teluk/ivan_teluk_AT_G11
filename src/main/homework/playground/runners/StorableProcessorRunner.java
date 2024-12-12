package main.homework.playground.runners;

import main.homework.playground.essence.Matter;
import main.homework.playground.essence.craft.hand.Bottle;
import main.homework.playground.essence.craft.hand.Can;
import main.homework.playground.essence.craft.hand.Container;
import main.homework.playground.essence.craft.hand.Storable;
import main.homework.playground.essence.material.*;
import main.homework.playground.processors.StorableProcessor;

public class StorableProcessorRunner {
    public static void main(String[] str) {
        StorableProcessor storableProcessorObject = new StorableProcessor();

        Bottle bottle = new Bottle(23, "Glass");
        Storable storableBottle = new Bottle(4, "Plastic");
        Container containerBottle = new Bottle(78, "Metal");
        Matter matterBottle = new Bottle(33, "Blue");
        Can can = new Can(23, "Wooden");
        Storable storableCan = new Can(82, "Small");
        Container containerCan = new Can(54, "Big");
        Matter matterCan = new Can(8, "Old");

        Petrol petrol = new Petrol(11);
        Pourable pourablePetrol = new Petrol(65);
        Pourable pourableDiesel = new Diesel(3);
        Powerable powerableDiesel = new Diesel(87);
        Matter matterPetrol = new Petrol(2);
        Water water = new Water(34);
        Pourable pourableWater = new Water(37);

        storableProcessorObject.runStorable(bottle, petrol);
        storableProcessorObject.runStorable(storableBottle, pourablePetrol);
        // storableProcessorObject.runStorable(containerBottle, pourableDiesel); Container не имплементит интерфейс Storable
        // storableProcessorObject.runStorable(matterBottle, powerableDiesel); Matter и Powerable не имплементит интерфейс Storable
        // storableProcessorObject.runStorable(can, matterPetrol); Matter не имплементит интерфейс Storable
        storableProcessorObject.runStorable(storableCan, water);
        // storableProcessorObject.runStorable(containerCan, pourableWater); Container не имплементит интерфейс Storable
        // storableProcessorObject.runStorable(matterCan, pourableWater); Container не имплементит интерфейс Storable






    }
}
