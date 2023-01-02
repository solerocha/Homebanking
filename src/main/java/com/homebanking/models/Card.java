package com.homebanking.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.homebanking.utils.EmisorType;

import lombok.Data;

@Data
@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String numberCard;

    @Column
    private Date fromDate;
    @Column
    private Date toDate;
    @Column
    private String nameClient;
    @Column
    private EmisorType emisor;
    @Column
    private int cvv;
    @Column
    private boolean contacless;
    @Column
    private boolean chip;

    @Column
    @ManyToOne
    private User owner;

    public Card() {

    }

    public Card(String numberCard, Date fromDate, Date toDate, String nameClient, EmisorType emisor, int cvv,
            boolean contacless, boolean chip) {
        this.numberCard = numberCard;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.nameClient = nameClient;
        this.emisor = emisor;
        this.cvv = cvv;
        this.contacless = contacless;
        this.chip = chip;
    }

}
