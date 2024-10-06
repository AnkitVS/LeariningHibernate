package org.learn.LearningHibernate;
import jakarta.persistence.*;

@Entity
@Table(name="facultyentity")
public class FacultyEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	private String name;
	@ManyToOne
	private SubjectEntity subject;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SubjectEntity getSubject() {
		return subject;
	}
	public void setSubject(SubjectEntity subject) {
		this.subject = subject;
	}
	
	
	public FacultyEntity() {
		super();
	}
	public FacultyEntity(int empId, String name, SubjectEntity subject) {
		super();
		this.empId = empId;
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "FacultyEntity [empId=" + empId + ", name=" + name + ", subject=" + subject + "]";
	}
}
