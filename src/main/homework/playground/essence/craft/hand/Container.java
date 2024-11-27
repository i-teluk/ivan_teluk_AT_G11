package main.homework.playground.essence.craft.hand;

import main.homework.playground.essence.Matter;

public abstract class Container extends Matter {
    protected String name;

    public Container(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
