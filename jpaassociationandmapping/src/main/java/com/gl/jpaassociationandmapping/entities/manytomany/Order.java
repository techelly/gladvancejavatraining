package com.gl.jpaassociationandmapping.entities.manytomany;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

/**
* 
* Order is the owning entity, owning entity should have @JoinTable
*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="order_master")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	private LocalDate orderDate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	/**
	 * Columns orderId and productId implicitly be composite primary key of the JOin table product_orders
	 */
	@JoinTable(name="product_orders",joinColumns= {@JoinColumn(name="orderId")},
										inverseJoinColumns = {@JoinColumn(name="productId")})
	@Exclude
	private Set<Product> products;



}
