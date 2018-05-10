/*
 * Archivo que contiene la Clase Trapecio 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase 
 * @author Gonzalo
 */
public class Trapecio {
    private double BaseMayor;
    private double BaseMenor;
    private double Haltura;
 
    public Trapecio(double basemayor, double basemenor,double haltura ) {
        this.BaseMayor = basemayor;
        this.BaseMenor = basemenor;
        this.Haltura = haltura;
    }

    public Trapecio() {

        this(0, 0,0);
    }

    public double getBaseMayor() {
        return BaseMayor;
    }

    public void setBaseMayor(double basemayor) {
        this.BaseMayor = basemayor;
    }

    public double getBaseMenor() {
        return BaseMenor;
    }

    public void setBaseMenor(double basemenor) {
        this.BaseMenor = basemenor;
    }
    
     public double getHaltura() {
        return Haltura;
    }

    public void setHaltura(double haltura) {
        this.Haltura = haltura;
    }

    public double getArea() {
        return ((this.BaseMayor + this.BaseMenor)*Haltura/2);
    }

    public double getPerimetro() {
        double x = (double) (this.BaseMayor-this.BaseMenor)/2;
        double h = (double) Math.sqrt((x*x)+(this.Haltura*this.Haltura));
        return this.BaseMayor+this.BaseMenor+2*h;
    }
}
