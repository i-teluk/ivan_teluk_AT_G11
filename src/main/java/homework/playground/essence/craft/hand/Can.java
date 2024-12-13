package homework.playground.essence.craft.hand;

import homework.playground.essence.material.Pourable;

public class Can extends Container implements Storable {
    public Can(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void store(Pourable pourable, int amount) {
        pourable.spread(getClass().getSimpleName());
        System.out.printf("I am %s, my name is %s and I received %s of %s\n", getClass().getSimpleName(), getName(), amount, pourable.getClass().getSimpleName());
        if (amount>mass) {
            System.out.println("waah-waah-waah-hh..");
        }
    }
}
