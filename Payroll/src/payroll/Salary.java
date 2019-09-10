package payroll;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "salary")
public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "base_salary", unique = false, nullable = false)
	private Double baseSalary;

	@Column(name = "travel_allow", unique = false, nullable = false)
	private Double travelAllow;

	@Column(name = "food_allow", unique = false, nullable = false)
	private Double foodAllow;

	@Column(name = "insurance", unique = false, nullable = false)
	private Double insurance;

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(Double baseSalary, Double travelAllow, Double foodAllow, Double insurance) {
		super();
		this.baseSalary = baseSalary;
		this.travelAllow = travelAllow;
		this.foodAllow = foodAllow;
		this.insurance = insurance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Double getTravelAllow() {
		return travelAllow;
	}

	public void setTravelAllow(Double travelAllow) {
		this.travelAllow = travelAllow;
	}

	public Double getFoodAllow() {
		return foodAllow;
	}

	public void setFoodAllow(Double foodAllow) {
		this.foodAllow = foodAllow;
	}

	public Double getInsurance() {
		return insurance;
	}

	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", baseSalary=" + baseSalary + ", travelAllow=" + travelAllow + ", foodAllow="
				+ foodAllow + ", insurance=" + insurance + "]";
	}

}
