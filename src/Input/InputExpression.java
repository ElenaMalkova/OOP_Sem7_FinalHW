package Input;
import java.util.Scanner;

public class InputExpression {


    public String Input() {
        String input;
        Scanner iScanner = new Scanner(System.in);
        if (iScanner.hasNext()) {
            input = iScanner.nextLine();
        } else {
            input = "ERROR";
        }
        iScanner.close();
        return input;
    }
}
