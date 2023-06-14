package com.gl.jpaassociationandmapping.inheritance.js;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="manager_js")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ManagerJS extends EmployeeJS {
	private String departmentName;

}
