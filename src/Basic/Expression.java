package Basic;

public abstract class Expression {
    private Double a1;
    private Double a2;
    private Double b1;
    private Double b2;
    private String Operator;

    public Expression(Double a1, Double b1, Double a2, Double b2, String Operator) {
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
        this.Operator = Operator;
    }

    public Expression() {
    }

    public Double getA1() {
        return a1;
    }

    public Double getA2() {
        return a2;
    }

    public Double getB1() {
        return b1;
    }

    public Double getB2() {
        return b2;
    }

    public String getOperator() {
        return Operator;
    }
}
