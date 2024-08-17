package lombok.test.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Car {

    private Integer id;
    private String modelo;
    private String ano;
    private String cor;
    private String motor;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", cor='" + cor + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
