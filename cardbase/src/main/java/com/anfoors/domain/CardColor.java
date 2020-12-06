package com.anfoors.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
public class CardColor {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToMany(mappedBy = "colors")
    private List<Card> cardsOfColor;

    @NotNull
    @Column(unique = true)
    private String name;
}
