package com.gl.jpaassociationandmapping.entities.onetoonebi;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Entity
@Table(name="address_onetoonebi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddressBi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String street;
	private String city;
	private String country;
	private Integer pinCode;
	
	@OneToOne(mappedBy="addressBi") //inverse side
	//@OneToOne(cascade = CascadeType.ALL) // owning side
	@Exclude
	@JsonIgnore
	private StudentBi studentBi;
}
