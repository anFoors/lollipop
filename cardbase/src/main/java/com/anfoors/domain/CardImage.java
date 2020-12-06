package com.anfoors.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class CardImage {

    @Id
    @GeneratedValue
    UUID id;

    @OneToOne(mappedBy = "image")
    ReleasedCard card;

    @ManyToOne
    @JoinColumn
    Artist artist;
}
