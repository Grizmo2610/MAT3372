package exercisesonclasses.mycomplex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public MyComplex() {
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag ==0)
            return real + "";
        else if (real == 0)
            return imag + "i";
        else if (imag < 0)
            return real + "" + imag + "i";
        return real + "+" + imag + "i";
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public boolean isReal(){
        return imag == 0;
    }

    public boolean isImaginary(){
        return real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return another.real == real && this.imag == imag;
    }

    public double magnitude(){
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex add(MyComplex right){
        setValue(real + right.real, imag + right.imag);
        return this;
    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(real + right.real, imag + right.imag);
    }
    public MyComplex subtract(MyComplex right){
        setValue(real - right.real, imag - right.imag);
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(real + right.real, imag + right.imag);
    }

    public MyComplex multiply(MyComplex right){
        setValue(real * right.real + imag * right.imag,
                 real * right.imag + imag * right.real);
        return this;
    }

    public MyComplex multiplyNew(MyComplex right){
        return new MyComplex(real * right.real + imag * right.imag,
                             real * right.imag + imag * right.real);
    }
    public MyComplex divide(MyComplex right){
        MyComplex temp = new MyComplex(-right.real, -right.imag);
        return this.multiplyNew(temp);
    }

    public double argument(){
        return Math.atan2(imag, real);
    }

    public MyComplex conjugate(){
        return new MyComplex(real, - imag);
    }
}
