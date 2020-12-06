package com.anfoors.domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Card {

    @Id
    @GeneratedValue
    UUID id;

    @OneToMany(mappedBy = "card")
    List<ReleasedCard> releases;
}
