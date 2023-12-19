package nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities;

import nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities.enums.Color;

public class Rectangle extends Shape {
    protected Double width;
    protected Double height;


    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(area());
        return sb.toString();
    }
}
