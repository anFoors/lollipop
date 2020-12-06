package com.anfoors.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class ResourceType {

    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    private String textSymbol;

    @NotNull
    @Column(unique = true)
    private String name;
}
