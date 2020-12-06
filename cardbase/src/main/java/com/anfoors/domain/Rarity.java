package com.anfoors.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
public class Rarity {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToMany(mappedBy = "rarity")
    List<ReleasedCard> cardsOfRarity;

    @NotNull
    @Column(unique = true)
    private String name;
}
