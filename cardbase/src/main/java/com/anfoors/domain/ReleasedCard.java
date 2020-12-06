package com.anfoors.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class ReleasedCard {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    UUID id;

    @ManyToOne
    @JoinColumn()
    Card card;

    @ManyToOne
    @JoinColumn()
    Release release;

    @OneToOne
    @JoinColumn()
    CardImage image;
}
