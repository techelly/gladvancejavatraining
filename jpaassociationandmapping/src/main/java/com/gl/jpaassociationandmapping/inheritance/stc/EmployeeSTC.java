package com.gl.jpaassociationandmapping.inheritance.stc;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
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
//Single Table per class
@Entity
@Table(name = "employee_stc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//Following annotation must be written only in parent class
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//Following is additional column to parent and child
@DiscriminatorColumn(name = "emp_type", discriminatorType = DiscriminatorType.STRING)
//parent rows will have this value Discriminator column
@DiscriminatorValue("EMP")
public class EmployeeSTC {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	private String name;
	private Double salary;
}
