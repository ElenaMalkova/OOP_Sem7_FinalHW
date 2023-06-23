package Input;

import Basic.Expression;
import Operations.Operations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser extends Expression {
    InputExpression ie = new InputExpression();

    String equation = "(-?[0-9]*\\.?[0-9]*)\\s*([-+][0-9]*\\.?[0-9]*)\\s*i\\s*([-+*/])\\s*(-?[0-9]*\\.?[0-9]*)\\s*([-+][0-9]*\\.?[0-9]*)\\s*i$";
    Pattern expression = Pattern.compile(equation);
    Matcher inputString = expression.matcher(ie.Input());

    public Parser(Double a1, Double b1, Double a2,  Double b2, String Operator) {
        super(a1, b1, a2, b2, Operator);
    }

    public Parser() {
    }

    public Parser p() {
        if (inputString.matches())
            return new Parser(Double.parseDouble(inputString.group(1)),
                    Double.parseDouble(inputString.group(2)),
                    Double.parseDouble(inputString.group(4)),
                    Double.parseDouble(inputString.group(5)),
                    inputString.group(3));
        else return null;
    }

    public void Calculate() {
        Operations o = new Operations();
        if (p().getOperator().equals("+")) {
            o.doSum(p().getA1(), p().getB1(), p().getA2(), p().getB2());
        }
        if (p().getOperator().equals("-")) {
            o.doSub(p().getA1(), p().getB1(), p().getA2(), p().getB2());
        }
        if (p().getOperator().equals("/")) {
            o.doDiv(p().getA1(), p().getB1(), p().getA2(), p().getB2());
        }
        if (p().getOperator().equals("*")) {
            o.doMul(p().getA1(), p().getB1(), p().getA2(), p().getB2());
        }
    }
}
