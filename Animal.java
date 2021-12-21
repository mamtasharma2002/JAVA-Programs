public class Animal {
    public int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("an animal has been created");
    }

    public void eat() {
        System.out.println("an animal is eating");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal(6);
        dog d1 = new dog();
        cat c1 = new cat();
        d1.ruff();
        c1.meow();
        a1.eat();
        d1.eat();
        c1.eat();
        d1.run();
    }
}
