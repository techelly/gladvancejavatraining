package com.gl.jpaassociationandmapping.entities.onetoonebi;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
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
@Table(name = "student_onetoonebi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentBi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	// Student class has an Address - HAS A relationship
	// One to one 
	@OneToOne(cascade = CascadeType.ALL) // owning side
	//@OneToOne(mappedBy="studentBi") //inverside side
	@Exclude
	private AddressBi addressBi;
}
