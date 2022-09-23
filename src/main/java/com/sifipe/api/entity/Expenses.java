package com.sifipe.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="st_despesa")
public class Expenses  implements Serializable{
    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String description;

	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "category", referencedColumnName = "id")
	private ExpenseCategories category;
	
	private Date createdAt;
	
	private BigDecimal value;
	
	public Expenses() {
		
	}
	
	public Expenses(long id, String description, ExpenseCategories category, Date createdAt, BigDecimal value) {
		this.id = id;
		this.description = description;
		this.category = category;
		this.createdAt = createdAt;
		this.value = value;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ExpenseCategories getCategory() {
		return category;
	}

	public void setCategory(ExpenseCategories category) {
		this.category = category;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	
	
	
}
