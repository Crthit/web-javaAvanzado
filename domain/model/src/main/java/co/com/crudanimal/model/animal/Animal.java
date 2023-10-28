package co.com.crudanimal.model.animal;
import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String nombre;
    private String genero;
    private Long patas;
    private String especie;
    private String habitat;
    private Boolean domestico;
}
