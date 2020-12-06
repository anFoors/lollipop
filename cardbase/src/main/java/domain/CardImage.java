package domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class CardImage {

    @Id
    @GeneratedValue
    @Column(name = "id")
    UUID uuid;

    @OneToOne(mappedBy = "image")
    ReleasedCard card;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    Artist artist;
}
