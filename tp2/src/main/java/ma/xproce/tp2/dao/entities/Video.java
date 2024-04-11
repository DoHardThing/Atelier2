package ma.xproce.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Getter
@Setter
@ToString
@Table(name="videos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name,url,description;
    private Date date_publication;
    @ManyToOne
    private Creator creator;

    public Video(int id,String name,String url, String description,Date date_publication){
        this.id=id;
        this.name=name;
        this.url=url;
        this.description=description;
        this.date_publication=date_publication;
    }


}
