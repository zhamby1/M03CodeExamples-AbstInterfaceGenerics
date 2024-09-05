public class Pig implements Animal{
    public Pig() {
    }

    @Override
    public void animalSound() {
        System.out.println("Pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Pig snores");

    }
}
