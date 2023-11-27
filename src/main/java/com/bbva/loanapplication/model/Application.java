package com.bbva.loanapplication.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "application")
public class Application {
    @Id
    @SequenceGenerator(
            name = "sequence_id",
            sequenceName = "sequence_id"
    )
    @GeneratedValue(
            generator = "sequence_id",
            strategy = GenerationType.SEQUENCE
    )

    private Long id_app;
    private LocalDate create_date;
    private String obs;
    private String state_app;
}
