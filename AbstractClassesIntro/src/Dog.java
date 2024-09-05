public class Dog extends Animal {
    public Dog(String name, String color, String trick) {
        super(name, color);
        this.trick = trick;
    }


    String trick;

    @Override
    public void animalSound() {
        System.out.println("Woof");
    }
}
