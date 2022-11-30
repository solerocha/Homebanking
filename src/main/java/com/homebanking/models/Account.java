package com.homebanking.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.homebanking.utils.AccountType;

import lombok.Data;

@Data
@Entity
@Table(name = "accounts")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private Double balance; // Monto
	private String cbu;
	private AccountType type;
	private Date creationDate;

	@ManyToOne
	private User owner;

	@OneToMany
	private List<Transaction> transactions;

	public Account() {

	}

	public Account(String name, Double balance, String cbu, AccountType type, Date creationDate) {
		this.name = name;
		this.balance = balance;
		this.cbu = cbu;
		this.type = type;
		this.creationDate = creationDate;
	}

}