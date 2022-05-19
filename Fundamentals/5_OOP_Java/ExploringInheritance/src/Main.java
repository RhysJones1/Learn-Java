public class Main {

    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1,1,5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Silky");
        dog.eat();
        dog.run();
        dog.move(55);
        dog.walk();

        Fish nemo = new Fish("Nemo", 2, 1, 2, 2, 2);
        nemo.swim(10);

    }
}
