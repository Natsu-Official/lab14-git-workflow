package calculator.src.test.java.lab14.sict.must.edu.mn;

import calculator.src.main.java.lab14.sict.must.edu.mn.Multiplication;

public class MultiplicationTest {
    @Test
    void testMultiplyPositive() {
        Multiplication m = new Multiplication();
        assertEquals(6.0, m.multiply(2, 3));
    }

    private void assertEquals(double d, double multiply) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testMultiplyNegative() {
        Multiplication m = new Multiplication();
        assertEquals(-6.0, m.multiply(-2, 3));
    }
}
