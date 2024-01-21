package old_exercises.N2.entities;

import old_exercises.N2.entities.enums.Color;

public class Car {
    private Integer id;
    private Color color;

    private int quantity;


    public Car() {
    }

    public Car(Integer id, Color color, int quantity) {
        this.id = id;
        this.color = color;
        this.quantity = quantity;
    }

    public Car(Integer id, Color color) {
        this.id = id;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void addCars(Integer quantity) {
        this.quantity += quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public static int existingID(Car[] cars, int id, String color) {
        int i;
        for(i =0; i < 25; i++) {
            if(cars[i] != null && cars[i].getId() == id && cars[i].getColor() == Color.valueOf(color)) {
                return i;
            }
        }
        return -1;
    }

    public static void relatorioGeral(Car[] cars) {
        int sum = 0;
        for(Car car : cars) {
            if(car != null) {
                sum += car.quantity;
                System.out.println(car);
            }
        }
        float ocupation = ((float) sum /150) * 100;
        System.out.printf("Quantidade total de carros: %d\n", sum);
        System.out.printf("Percentagem total de carros na garagem: %.2f%%\n", ocupation);
        System.out.println("Pressione Enter para continuar...");
        new java.util.Scanner(System.in).nextLine();
    }

    public static void menu() {
        System.out.print("1 - RELATORIO GERAL\n" +
                "2 - RELATORIO POR COR\n" +
                "3 - RELATORIO POR CÓDIGO\n" +
                "4 - BUSCA POR VEÍCULO\n" +
                "5 - CADASTRAR VEICULO\n" +
                "6 - SAIR\n" +
                "OPTION ==> ");
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ");
        sb.append(getId() + ", ");
        sb.append(getColor() + ", ");
        sb.append( "quantity: "+ getQuantity());
        return sb.toString();
    }
}
