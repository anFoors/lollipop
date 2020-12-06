package com.anfoors.domain;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "releaze")
public class Release {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToMany(mappedBy = "release")
    private List<ReleasedCard> releasedCards;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @URL
    @NotNull
    @Column(unique = true)
    private String behoURL;
}
