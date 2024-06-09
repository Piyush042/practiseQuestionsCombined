import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random integer
        int randomInt = random.nextInt(); // any integer
        System.out.println("Random Integer: " + randomInt);

        // Generate a random integer within a specific range (0 to 99)
        int randomIntInRange = random.nextInt(100);
        System.out.println("Random Integer (0-99): " + randomIntInRange);
    }
}
