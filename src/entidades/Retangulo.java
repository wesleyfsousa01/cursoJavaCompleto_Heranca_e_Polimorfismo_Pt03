package entidades;

import enums.Cores;

public class Retangulo extends Forma {
    private Double largura;
    private Double altura;

    public Retangulo(Cores cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return largura * altura;
    }
}
