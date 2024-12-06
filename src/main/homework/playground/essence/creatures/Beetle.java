package main.homework.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot carrot) {
        if (carrot.getMass() > mass) {
            int D = carrot.getMass() / mass;
            String nestBeetle = String.format("I am %s and I will nest there with %d my family members!", name, D);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }


    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units\n", getClass().getSimpleName(), this.getName(), direction, distance);
        System.out.println("vz-vz-vzz-zz..");
    }
}