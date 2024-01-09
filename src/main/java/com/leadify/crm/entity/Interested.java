package com.leadify.crm.entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Table(name = "Interested ")
public class Interested {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String first_name;
    @Column(nullable = true)
    private String second_name;
    @Column(nullable = true, columnDefinition = "VARCHAR(255) DEFAULT NULL")
    private String business_name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String campaign;
    @Column(nullable = true)
    private LocalDateTime interest_date;
    @Column(nullable = true)
    private Boolean booked;
    @ManyToOne
    @JoinColumn(name = "stage_id", nullable = false)
    private Stage stage_id;
    @Column(nullable = true)
    private String notes;
    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;
}