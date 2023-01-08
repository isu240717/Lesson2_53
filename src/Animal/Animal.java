package Animal;

import common_interface.Drawable;

public abstract class Animal implements Drawable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void draw() {}

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
