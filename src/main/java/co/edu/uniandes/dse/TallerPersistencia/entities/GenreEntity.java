package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import java.util.List;
import java.util.ArrayList;

@Data
@Entity
public class GenreEntity extends BaseEntity {

    private String name;
    
    @ManyToMany(mappedBy = "genres")
    private List<MovieEntity> movies = new ArrayList<>();
}