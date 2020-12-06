package domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    @Column(name = "id")
    UUID uuid;

    @OneToMany(mappedBy = "artist")
    List<CardImage> cardImages;
}
