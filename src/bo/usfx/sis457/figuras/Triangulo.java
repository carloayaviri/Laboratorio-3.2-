/*
 * Archivo que contiene la Clase Triangulo
 */
package bo.usfx.sis457.figuras;

/**
 * Clase 
 * @author Gonzalo
 */
public class Triangulo {
    private double B;
    private double A;

    public Triangulo(double b, double a) {
        this.B = b;
        this.A = a;
    }

    public Triangulo() {

        this(0, 0);
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        this.B = b;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        this.A = a;
    }

    public double getArea() {
        return (this.B * this.A)/2;
    }

    public double getPerimetro() {
        double H = (double) Math.sqrt((this.B*this.B)+(this.A*this.A));
	return (this.B)+(this.A)+H;
    }
}
