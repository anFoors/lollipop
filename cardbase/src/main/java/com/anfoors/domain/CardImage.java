package com.anfoors.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class CardImage {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    UUID id;

    @OneToOne(mappedBy = "image")
    ReleasedCard card;

    @ManyToOne
    @JoinColumn()
    Artist artist;
}
