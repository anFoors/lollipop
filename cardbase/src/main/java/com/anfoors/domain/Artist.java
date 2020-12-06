package com.anfoors.domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    UUID id;

    @OneToMany(mappedBy = "artist")
    List<CardImage> cardImages;
}
