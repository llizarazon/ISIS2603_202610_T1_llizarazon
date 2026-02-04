package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;
import lombok.Data;

@Data
@Entity
public class MovieEntity extends BaseEntity {
    @ManyToOne
    DirectorEntity director;

    @ManyToMany
    private List<GenreEntity> genres = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private ScriptEntity script;
    
    private String title;
    private Integer releaseYear;
}
