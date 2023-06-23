package Basic;

public abstract class ResultOutput {
    protected static void sResult(double real, double imaginary) {
        if (imaginary == 1 || imaginary == -1)
            System.out.println("Результат = " + real + " + i");
        else if (imaginary == 0 && real == 0)
            System.out.println("Результат = 0");
        else if (imaginary != 0)
            System.out.println("Результат = " + real + imaginary + "i");
        else
            System.out.println("Результат = " + real);
            }
}
