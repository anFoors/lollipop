package com.anfoors.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
public abstract class Card {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToMany(mappedBy = "card")
    private List<ReleasedCard> releases;

    @ManyToMany
    @JoinTable(
            name = "card_color_join",
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id")
    )
    private List<CardColor> colors;

    @NotNull
    @Column(columnDefinition = "text")
    private String behoRulesText;
}
