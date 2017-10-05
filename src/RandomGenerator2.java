import java.util.Random;

public class RandomGenerator2 {
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 5 and 95");
        Random rnd = new Random();

        for (int i = 1; i <= 10; ++i)
        {
            // changed to generate number between 5 and 95
            int randomInt = 5 + rnd.nextInt(95);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}