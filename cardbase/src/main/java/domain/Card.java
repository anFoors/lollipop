package domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Card {

    @Id
    @GeneratedValue
    @Column(name = "id")
    UUID uuid;

    @OneToMany(mappedBy = "card")
    List<ReleasedCard> releases;
}
