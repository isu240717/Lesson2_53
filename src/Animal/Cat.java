package Animal;

public class Cat extends Animal{
    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\uD83D\uDC08");
    }
}
