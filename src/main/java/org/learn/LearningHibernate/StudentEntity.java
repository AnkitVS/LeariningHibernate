package org.learn.LearningHibernate;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="StudentEntity")
public class StudentEntity {

	private String name;
	@Column(name="class")
	private int standard;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roll_no;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="subjectId")
	private List<SubjectEntity> subject;
	
	
	public List<SubjectEntity> getSubject() {
		return subject;
	}
	public void setSubject(List<SubjectEntity> subject) {
		this.subject = subject;
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
	public StudentEntity(String name, int standard, int roll_no, List<SubjectEntity> subject) {
		super();
		this.name = name;
		this.standard = standard;
		this.roll_no = roll_no;
		this.subject = subject;
	}
	public StudentEntity() {
		super();
	}
	@Override
	public String toString() {
		return "StudentEntity [name=" + name + ", standard=" + standard + ", roll_no=" + roll_no + ", subject="
				+ subject + "]";
	}

	
}
