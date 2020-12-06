package com.anfoors.domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "releaze")
public class Release {

    @Id
    @GeneratedValue
    UUID id;

    @OneToMany(mappedBy = "release")
    List<ReleasedCard> releasedCards;
}
