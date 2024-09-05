public class Dog implements Animal{

    public Dog() {
    }

    @Override
    public void animalSound() {
        System.out.println("Woof");
    }

    @Override
    public void sleep() {
        System.out.println("Dog does not snore");

    }
}
