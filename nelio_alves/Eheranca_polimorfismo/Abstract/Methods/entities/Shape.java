package nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities;

import nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities.enums.Color;

public abstract class Shape {
    protected Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();


}
