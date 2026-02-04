package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class DirectorEntity extends BaseEntity {
    private String name;
    private String nationality;

    @OneToMany(mappedBy = "movies", fetch = FetchType.LAZY)

    List<MovieEntity> movieEntities = new ArrayList<>();
}

