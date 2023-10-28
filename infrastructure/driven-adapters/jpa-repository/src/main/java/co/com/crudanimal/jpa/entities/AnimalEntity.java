package co.com.crudanimal.jpa.entities;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "tbAnimal")
public class AnimalEntity {

    @Id private String nombre;
    @Column private String genero;
    @Column private Long patas;
    @Column private String especie;
    @Column private String habitat;
    @Column private Boolean domestico;
}