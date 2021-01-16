public class MultiAdd implements MultiplicationStrategy{
    @Override
    public int multiplicate(int n1, int n2) {
        System.out.println("Multiplicate with Add Operator");
        int N=0;
        for(int i=0;i<n2;i++){
            N+=n1;
        }
        return N;
    }
}
