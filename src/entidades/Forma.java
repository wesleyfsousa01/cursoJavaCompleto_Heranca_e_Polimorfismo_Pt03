package entidades;

import enums.Cores;

public abstract class Forma {
    private Cores Color;

    public Forma(Cores color) {
        Color = color;
    }

    public Cores getColor() {
        return Color;
    }

    public void setColor(Cores color) {
        Color = color;
    }

    public abstract Double area();;
}
