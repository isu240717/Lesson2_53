import Animal.*;
import Figure.*;
import common_interface.Drawable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг: ", 20);
        Triangle triangle = new Triangle(20, 20, 20, "Треугольник");
        Rectangle rectangle = new Rectangle("Прямоугоьник", 25, 25);
        Square square = new Square("Квадрат", 10);

        Cat cat = new Cat("Маруся", 6);
        Dog dog = new Dog("Палкан",10);


        Drawable[] drawables = new Drawable[]{circle, triangle, rectangle, square, cat, dog};
        for (Drawable item : drawables) {
            if (item instanceof Figure figure){
                System.out.println(((Figure)item).getName());
                System.out.println(figure.calculatedPerimeter());
            } else if (item instanceof Animal animal) {
                System.out.println(animal.getName());
                System.out.println(((Animal)item).getAge());
            }
            item.draw();

        }
    }
}