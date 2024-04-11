package ma.xproce.tp2.dao.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Table(name = "creators")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Creator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name,email;

    @OneToMany(mappedBy = "creator",fetch = FetchType.LAZY)
    private Collection<Video> videos;
    public Creator(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
}
