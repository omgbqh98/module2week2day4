public class TriangleClassifier {
    public static String triangularClassification(int edgeA, int edgeB, int edgeC) {
        if (edgeA == edgeB && edgeA == edgeC) {
            return "tam giac deu";
        } else if (edgeA == edgeB && edgeC > edgeA) {
            return "tam giac can";
        } else if (edgeA < edgeB && edgeB < edgeC) {
            return "tam giac thuong";
        } else {
            return "không phải tam giac";
        }
    }
}
