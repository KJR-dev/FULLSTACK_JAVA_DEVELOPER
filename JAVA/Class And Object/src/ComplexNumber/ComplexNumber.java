// Define a class Complex to represent a complex number. Declare instance member variables to store real and imaginary
// part of a complex number, also define instance member functions to set values of complex number and print values of
// complex number
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