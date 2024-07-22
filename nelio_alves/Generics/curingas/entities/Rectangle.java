package nelio_alves.Generics.curingas.entities;

import nelio_alves.Generics.curingas.interfaces.Shape;

public class Rectangle implements Shape {

    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
