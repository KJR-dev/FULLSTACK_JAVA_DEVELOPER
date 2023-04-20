package ComplexNumber;
public class ComplexNumber{
    private int real,imag;
    public void setComplexNumber(int x,int y){
        real=x;
        imag=y;
    }
    public void showComplexNumber(){
        System.out.println("real= "+real+" imag= "+imag);
    }
}