import Input.Parser;
public class Main {
    public static void main(String[] args) {
        System.out.print("Вводите два комплексных числа в строку.\n" +
                "Комплексное число вида \"2+i\" вводить как \"2+1i\".\n" +
                "\nВведите выражение: ");

        Parser parser = new Parser();
        parser.Calculate();
            }
}