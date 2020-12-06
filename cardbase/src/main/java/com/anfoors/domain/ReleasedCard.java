package com.anfoors.domain;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class ReleasedCard {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn
    private Card card;

    @ManyToOne
    @JoinColumn
    private Release release;

    @ManyToOne
    @JoinColumn
    private Rarity rarity;

    @OneToOne
    @JoinColumn
    private CardImage image;

    @URL
    @NotNull
    @Column(unique = true)
    private String behoURL;
}
