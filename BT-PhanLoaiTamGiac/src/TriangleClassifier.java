public class TriangleClassifier {
    public static String triangularClassification(int edgeA, int edgeB, int edgeC) {
        if (edgeA < 0 || edgeB < 0 || edgeC < 0) {
            return "loi";
        } else {
            if (edgeA == edgeB && edgeA == edgeC) {
                return "tam giac deu";
            } else if (edgeA == edgeB && edgeA + edgeB > edgeC && edgeC > edgeA) {
                return "tam giac can";
            } else if (edgeA < edgeB && edgeB < edgeC) {
                return "tam giac thuong";
            } else {
                return "không phải tam giac";
            }
        }
    }
}
