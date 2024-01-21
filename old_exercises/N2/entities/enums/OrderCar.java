package old_exercises.N2.entities.enums;

import old_exercises.N2.entities.Car;

public class OrderCar {
    private Car car;
    private Integer total;

    public OrderCar(Car car, Integer total) {
        this.car = car;
        this.total = total;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
