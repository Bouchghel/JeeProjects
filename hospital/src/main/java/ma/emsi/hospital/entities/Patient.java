package ma.emsi.hospital.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date DateNaissance;
    private boolean malade;
    @OneToMany(mappedBy = "patient" ,fetch =FetchType.LAZY)
    private Collection<RendezVous> rendezVous;
}
