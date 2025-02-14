package com.anfoors.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToMany(mappedBy = "artist")
    private List<CardImage> cardImages;

    @NotNull
    private String name;
}
