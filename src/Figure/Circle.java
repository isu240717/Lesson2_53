package Figure;

public class Circle extends Figure {

    private Integer radius;

    public Integer calculatedPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    public Circle(String name, Integer radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("⦿");
    }
}

