public class Wizards extends Human implements Characters {

    private int power;

    @Override
    public void jump() {
        System.out.println("Wizards Are Jumping");
    }

    @Override
    public void defend() {
        System.out.println("Wizards Defended The Attack");
    }

    @Override
    public void speak() {
        System.out.println("Wizards Are Speaking");
    }

    @Override
    public void attack() {
        if (health <= 0 || health > 100) {
            throw new ArithmeticException("Character is Wasted");
        }
        else {
            System.out.println("Wizards Are Attacking By Fireballs");
            power=health-20;
            System.out.println("Health: "+power);
        }
    }

    @Override
    public void explore() {
        System.out.println("Wizards Are Exploring");
    }

    public void heal() {
        if (power <= 0 || power > 100) {
            System.out.println("Character Has Been Wasted");
        } else {
            System.out.println("Wizards Are Healing");
            power =power+ 10;
            System.out.println("Health:" +power);
        }

    }
}
