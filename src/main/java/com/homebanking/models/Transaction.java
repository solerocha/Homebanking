package com.homebanking.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;
    // private TransactionsType type;
    private Double amount;
    private String description;
    private Date date;

    @ManyToOne
    private Account account;

    public Transaction() {

    }

    public Transaction(Double amount, String description, Date date) {
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

}
