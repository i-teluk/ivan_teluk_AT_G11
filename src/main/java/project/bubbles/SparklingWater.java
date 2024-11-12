package main.java.project.bubbles;

public class SparklingWater extends Water {
    private Bubble[] bubbles;
    private boolean isClosed = true;

    public SparklingWater(String color, String transparency, String smell, int temperature, double volume) {
        super(color, transparency, smell, temperature);
        new Thread(this::isOpened).start();
    }

    public void open() {
        isClosed = false;
    }

    private void isOpened() {
        try {
            while (true) {
                Thread.sleep(2000);
                if (!isClosed) {
                    degas();
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        System.out.println("Pumping bubbles");
    }

    public void degas() {
        int bubblesPerSecond = 10 + (5 * getTemperature());
        int bubbleCount = 0;
        while (bubbleCount < bubbles.length) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < bubblesPerSecond && bubbleCount < bubbles.length; i++) {
                if (bubbles[bubbleCount] != null) {
                    if (i % 50 == 0 && i != 0) {
                        bubbles[bubbleCount].cramp();
                    }
                    bubbles[bubbleCount] = null;
                }
                bubbleCount++;
            }
        }
        System.out.println("Degas");
    }
}
