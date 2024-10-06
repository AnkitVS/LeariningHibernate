package org.learn.LearningHibernate;

import jakarta.persistence.*;

@Entity
@Table(name="LearningHibernateEntity")
public class StudentEntity {

	private String name;
	@Column(name="class")
	private int standard;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roll_no;
	
	public StudentEntity() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public StudentEntity(String name, int standard, int roll_no) {
		super();
		this.name = name;
		this.standard = standard;
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "LearningHibernateEntity [name=" + name + ", standard=" + standard + ", roll_no=" + roll_no + "]";
	}
	
}
