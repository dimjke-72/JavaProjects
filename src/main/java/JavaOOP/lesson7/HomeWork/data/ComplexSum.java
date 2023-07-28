package JavaOOP.lesson7.HomeWork.data;

public class ComplexSum implements Operations {

    public Complex getExecute(Complex a, Complex b) {
        double real = a.re() + b.im();
        double img = a.im() + b.im();
        return new Complex(real, img);
    }
}
