package com.gl.jpaassociationandmapping.inheritance.tpc;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="manager_tpc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ManagerTPC extends EmployeeTPC {
	private String departmentName;

}
