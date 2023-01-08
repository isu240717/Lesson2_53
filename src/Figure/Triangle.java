package Figure;

public class Triangle extends Figure {
    private Integer sideA, sideB, sideC;


    public Integer calculatedPerimeter() {
        return sideA + sideB + sideC;
    }

    public Triangle(Integer sideA, Integer sideB, Integer sideC, String name) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("▲");
    }
}
