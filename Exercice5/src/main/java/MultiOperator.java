public class MultiOperator implements MultiplicationStrategy{
    @Override
    public int multiplicate(int n1, int n2) {
        System.out.println("Multiplicate with Multiplication Operator");
        return n1*n2;
    }
}
