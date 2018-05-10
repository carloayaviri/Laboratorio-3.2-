/*
 * Archivo que contiene la Clase Pentagono
 */
package bo.usfx.sis457.figuras;

/**
 * Clase 
 * @author Gonzalo
 */
public class Pentagono {
    private double Lado;

    public Pentagono(double lado) {
        this.Lado = lado;
    }

    public Pentagono() {
 
        this(0);
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double lado) {
        this.Lado = lado;
    }
 
    public double getArea() {
        double Apotema = (double) this.Lado/(2*Math.tan(360/(2*5)));
        double Perimetro=(double) 5*this.Lado;
        return (Perimetro*Apotema)/2;
    }

    public double getPerimetro() {
        return 5*this.Lado;
    }
}

