package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class totalReactionSummery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index_number;
    private int range;
    private long total_count;
}
