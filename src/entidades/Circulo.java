package entidades;

import enums.Cores;

public class Circulo extends Forma {
    private Double raio;

    public Circulo(Cores color, Double raio) {
        super(color);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        double pi = 3.141592;
        double area =  pi * Math.pow(raio,2);
        return area;
    }
}
