package by.itland.itjava.davydovskikh.less17;

import java.util.Objects;

public class Dog implements Comparable<Dog> {

    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object other) {
//        Dog otherDog = (Dog) other;
//        return this.age == otherDog.age && this.name.equals(otherDog.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
//        if (this.age < o.age)
//            return -1;
//        else if (this.age > o.age)
//            return 1;
//        return 0;
      return Integer.compare(this.age, o.age);
    }
}
