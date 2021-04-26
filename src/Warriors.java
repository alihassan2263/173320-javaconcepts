public class Warriors extends Human implements Characters {
    private static int power = 100;

    @Override
    public void jump() {
        System.out.println("Warriors Are Juming");
    }

    @Override
    public void defend() {
        System.out.println("Warriors Defended The Attack");
    }

    @Override
    public void speak() {
        System.out.println("Warriors Are Speaking");
    }

    @Override
    public void attack() {

        if (power <= 0 || power > 100) {
            throw new ArithmeticException("Character is Wasted");
        }
        else {
            System.out.println("Warriors Are Attacking By Swords");
            power=power-20;
            System.out.println("Health: "+power);
        }
    }

    @Override
    public void explore() {
        System.out.println("Warriors Are Exploring");
    }

    public void capture() {
        System.out.println("Warriors Are Capturing");
    }
}
