package calculator.src.test.java.lab14.sict.must.edu.mn;

import calculator.src.main.java.lab14.sict.must.edu.mn.Division;

public class DivisionTest {
    @Test
    void testDivideNormal() {
        Division d = new Division();
        assertEquals(2.0, d.divide(4, 2));
    }

    private void assertEquals(double d, double divide) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testDivideNegative() {
        Division d = new Division();
        assertEquals(-2.0, d.divide(-4, 2));
    }

    @Test
    void testDivideByZero() {
        Division d = new Division();
        assertThrows(IllegalArgumentException.class, () -> d.divide(4, 0));
    }

    private void assertThrows(Class<IllegalArgumentException> class1, Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertThrows'");
    }

}
