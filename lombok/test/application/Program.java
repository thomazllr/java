package lombok.test.application;


import lombok.test.entities.Car;

public class Program {
    public static void main(String[] args) {

       Car car = Car.builder().motor("tal").ano("2027").id(2).modelo("TAL2").cor("AZUL").build();

        System.out.println(car);

    }

}
