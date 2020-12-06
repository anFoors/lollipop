package domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Release {

    @Id
    @GeneratedValue
    @Column(name = "id")
    UUID uuid;

    @OneToMany(mappedBy = "release")
    List<ReleasedCard> releasedCards;
}
