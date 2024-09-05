abstract class Animal {
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }



    //abstract methods do not have implementation
    //ie that means that the subclass must code the actual method
    //why we use it is to make sure that all sub classes of Animal have the method animalSound()
    public abstract void animalSound();
}
