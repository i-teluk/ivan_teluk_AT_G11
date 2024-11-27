package main.project.bubbles;

public class Runner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(0.5, 12);
        Bottle bottle2 = new Bottle(1, 18);
        Bottle bottle3 = new Bottle(1.5, 25);

        bottle1.pumped();
        bottle2.pumped();
        bottle3.pumped();

        bottle1.open();
        bottle2.open();
        bottle3.open();
    }
}
