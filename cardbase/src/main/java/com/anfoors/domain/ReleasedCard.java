package com.anfoors.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class ReleasedCard {

    @Id
    @GeneratedValue
    UUID id;

    @ManyToOne
    @JoinColumn
    Card card;

    @ManyToOne
    @JoinColumn
    Release release;

    @OneToOne
    @JoinColumn
    CardImage image;
}
