import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void testTriangularClassification1() {
        String expected = "tam giac deu";

        String result = TriangleClassifier.triangularClassification(2, 2, 2);
        assertEquals(expected, result);
    }

    @Test
    void testTriangularClassification2() {
        String expected = "tam giac can";

        String result = TriangleClassifier.triangularClassification(2, 2, 3);
        assertEquals(expected, result);
    }

    @Test
    void testTriangularClassification3() {
        String expected = "tam giac thuong";

        String result = TriangleClassifier.triangularClassification(3, 4, 5);
        assertEquals(expected, result);
    }

    @Test
    void testTriangularClassification4() {
        String expected = "không phải tam giac";

        String result = TriangleClassifier.triangularClassification(0, 1, 1);
        assertEquals(expected, result);
    }
}