package klu.model;

import jakarta.persistence.*;

@Entity
@Table(name = "income_sources")
public class IncomeSource {
	@Column
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private double amount;
    @Column
    private String frequency;
    @Column
    private int familyCount;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public int getFamilyCount() {
		return familyCount;
	}
	public void setFamilyCount(int familyCount) {
		this.familyCount = familyCount;
	}
	@Override
	public String toString() {
		return "IncomeSource [id=" + id + ", name=" + name + ", amount=" + amount + ", frequency=" + frequency
				+ ", familyCount=" + familyCount + "]";
	}
    
    
    
}
