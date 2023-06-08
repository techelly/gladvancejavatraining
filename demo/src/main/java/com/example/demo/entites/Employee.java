package com.example.demo.entites;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author UD SYSTEMS
 *in record classes all data members are private and 
 *final by default but this is not the case with lombok dependency

 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee {
	private Integer empId;
	private String empName;
}
