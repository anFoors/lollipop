package com.anfoors.domain;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class CardImage {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne(mappedBy = "image")
    private ReleasedCard card;

    @ManyToOne
    @JoinColumn
    private Artist artist;

    @URL
    @NotNull
    @Column(unique = true)
    private String behoURL;
}
