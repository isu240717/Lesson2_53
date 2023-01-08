package Figure;

import common_interface.Drawable;

public abstract class Figure implements Drawable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract Integer calculatedPerimeter();

    public Figure(String name) {
        this.name = name;
    }

    @Override
    public void draw() {

    }
}
