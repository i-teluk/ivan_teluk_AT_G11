package bubbles;

public class Bubble {
    private final float V = 0.3f;
    private String content;

    public Bubble(String content) {
        this.content = content;
    }

    public float getV() {
        return V;
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
