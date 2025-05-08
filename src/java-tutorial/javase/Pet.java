
public class Pet {
    public String name;
    public String furColor;
    public int age;

    public Pet() {
    }

    public Pet(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    int getAge() {
        return age;
    }

    void setAge(int age){
        this.age=age;
    }


    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "博美";
        dog.furColor = "White";
        dog.age = 2;

        Pet cat = new Pet();
        cat.name = "英短";
        cat.furColor = "orange";
        cat.age = 2;

        System.out.println(dog.name + " " + dog.furColor + " " + dog.age);
        System.out.println(cat.name + " " + cat.furColor + " " + cat.age);

        dog.eat();
    }
}
