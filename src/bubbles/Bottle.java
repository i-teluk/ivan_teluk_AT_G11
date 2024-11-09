package bubbles;

public class Bottle {
    private double volume;
    private SparklingWater sparklingWaters;

    public Bottle(double volume) {
        this.volume = volume;
        this.sparklingWaters = new SparklingWater("without color", "transparent", "without smell", 20, volume);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void open() {
        sparklingWaters.degas();
        System.out.println("Bottle is open. Bottle's volume is " + volume);
    }
}
