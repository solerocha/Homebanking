package com.homebanking.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;

    @Column
    private Double amount;

    @Column
    private String description;

    @Column
    private Date date_trans;

    @Column
    private Account id_account_destine;

    @Column
    private Account id_account_source;

    public Transaction() {

    }

    public Transaction(Double amount, String description, Date date) {
        this.amount = amount;
        this.description = description;
        this.date_trans = date;
    }

}
