package com.gl.jpaassociationandmapping.inheritance.tpc;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="employee_tpc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//Following annotation must be written only in parent class
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class EmployeeTPC {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empId;
	private String name;
	private Double salary;
}
