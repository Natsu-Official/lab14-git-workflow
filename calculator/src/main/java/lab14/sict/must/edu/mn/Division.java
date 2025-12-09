package calculator.src.main.java.lab14.sict.must.edu.mn;

public class Division {
    public double divide(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException("Cannot divide by zero");
    }
    return a / b;
}

}
