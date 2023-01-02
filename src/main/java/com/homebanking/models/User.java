package com.homebanking.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String dni;

	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String address;
	@Column
	private String phone;
	@Column
	private LocalDate dayOfBirth;
	@Column
	private String gender;

	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String username;

	@Column
	@OneToMany
	private List<Account> accounts;

	@Column
	@OneToMany
	private List<Card> cards;

	/*
	 * @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	 * Set<ClientLoans> clientLoans
	 */

}
