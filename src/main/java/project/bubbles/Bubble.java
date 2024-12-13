package project.bubbles;

public class Bubble {
    private final double volume = 0.3;
    private String content;

    public Bubble(String content) {
        this.content = content;
    }

    public double getVolume() {
        return volume;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }
}
