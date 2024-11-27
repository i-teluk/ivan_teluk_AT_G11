package main.project.bubbles;

public class Bottle {
    private double volume;
    private SparklingWater sparklingWaters;

    public Bottle(double volume, int temperature) {
        this.volume = volume;
        this.sparklingWaters = new SparklingWater("without color", "transparent", "without smell", temperature, volume);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void pumped() {
        int bobbleCount = (int) (volume * 10000);
        Bubble[] bubbles = new Bubble[bobbleCount];
        sparklingWaters.pump(bubbles);
    }

    public void open() {
        sparklingWaters.open();
        System.out.println("Bottle is open. Bottle's volume is " + volume);
    }
}
