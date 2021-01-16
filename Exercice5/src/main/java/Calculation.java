public class Calculation {
    private MultiplicationStrategy multipication;

    public Calculation(MultiplicationStrategy multipication) {
        this.multipication = multipication;
    }

    public int multiplicate(int n1,int n2){
        return  multipication.multiplicate(n1,n2);
    }

    public void setMultipication(MultiplicationStrategy multipication){
        this.multipication = multipication;
    }
}
