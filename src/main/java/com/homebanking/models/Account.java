package com.homebanking.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
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

	@Column
	private String name;

	@Column
	private Double balance; // Monto

	@Column
	private String cbu;

	@Column
	private AccountType type;

	@Column
	private LocalDate creationDate;

	@ManyToOne
	private User owner;

	@OneToMany
	private List<Transaction> transactions;

	public Account() {

	}

	public Account(String name, Double balance, String cbu, AccountType type, LocalDate creationDate) {
		this.name = name;
		this.balance = balance;
		this.cbu = cbu;
		this.type = type;
		this.creationDate = creationDate;
	}

}