package nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities;

import nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities.enums.Color;

public class Circle extends Shape {

    private final double PI = 3.14;

    protected Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(area());
        return sb.toString();
    }
}
