package org.api.miprimeraapirest.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resultid")
    private Long resultId;

    @ManyToOne
    @JoinColumn(name = "raceid")
    @JsonManagedReference
    private Race race;
    private int grid;
    private Integer position;
    private int points;
}
