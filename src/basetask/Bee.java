package basetask;

public class Bee {
    private String gender;
    private long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public long getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        long l = 500L * 1000L / weight;
        System.out.println("Я легче лося в " + l + " раз");
    }
}
