public class Alliens implements Characters {
    private int power=100;

    @Override
    public void jump() {
        System.out.println("Alliens Are Jumping");
    }

    @Override
    public void defend() {
        System.out.println("Alliens Defended The Attack");
    }

    @Override
    public void speak() {
        System.out.println("Alliens Are Speaking");
    }

    @Override
    public void attack() {
        System.out.println("Alliens Attack");
         power= power - 5;
        System.out.println("Health= " + power);
    }
}
