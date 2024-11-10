package main.java.project.bubbles;

public class SparklingWater extends Water {
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature, double volume) {
        super(color, transparency, smell, temperature);
        int bobbleCount = (int) (volume * 10000);
        this.bubbles = new Bubble[bobbleCount];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        System.out.println("Pumping bubbles");
    }

    public void degas() {
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
                if (i % 1000 == 0) {
                    bubbles[i].cramp();
                }
                bubbles[i] = null;
            }
        }
        System.out.println("Degas");
    }
}
