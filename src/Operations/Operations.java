package Operations;
import Basic.ResultOutput;

public class Operations extends ResultOutput {
    public void doSum(Double a1, Double b1, Double a2, Double b2){
        double real = a1 + (a2);
        double imaginary = b1 + (b2);
        ResultOutput.sResult(real, imaginary);
    }
    public void doSub(Double a1, Double b1, Double a2, Double b2){
        double real = a1 - (a2);
        double imaginary = b1 - (b2);
        ResultOutput.sResult(real, imaginary);
    }
    public void doDiv(Double a1, Double b1, Double a2, Double b2){
        double real = (a1 * a2 + b1 * b2) / (a2 * a2 + b2 * b2);
        double imaginary = (a2 * b1 - a1 * b2) / (a2 * a2 + b2 * b2);
        ResultOutput.sResult(real, imaginary);
    }
    public void doMul(Double a1, Double b1, Double a2, Double b2){
        double real = (a1 * a2 - b1 * b2);
        double imaginary = (a1 * b2 + b1 * a2);
        ResultOutput.sResult(real, imaginary);
    }
}
