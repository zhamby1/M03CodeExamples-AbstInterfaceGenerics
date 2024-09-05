public class Cat extends Animal {

    String species;

    public Cat(String name, String color, String species) {
        super(name, color);
        this.species = species;
    }



    @Override
    public void animalSound() {
        System.out.println("meow");

    }
}
