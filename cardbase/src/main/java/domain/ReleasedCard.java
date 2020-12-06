package domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class ReleasedCard {

    @Id
    @GeneratedValue
    @Column(name = "id")
    UUID id;

    @ManyToOne
    @JoinColumn(name = "card_id")
    Card card;

    @ManyToOne
    @JoinColumn(name = "release_id")
    Release release;

    @OneToOne
    @JoinColumn(name = "image_id")
    CardImage image;
}
