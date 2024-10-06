package org.learn.LearningHibernate;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="subjectentity")
public class SubjectEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subjectId;
	
	@Column(name="subjectName")
	private String name;
	
	@OneToMany(mappedBy="subject")
	private List<FacultyEntity>faculty;
	
	public List<FacultyEntity> getFaculty() {
		return faculty;
	}
	public void setFaculty(List<FacultyEntity> faculty) {
		this.faculty = faculty;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SubjectEntity(int subjectId, String name) {
		super();
		this.subjectId = subjectId;
		this.name = name;
	}
	
	public SubjectEntity() {
		super();
	}
	
	@Override
	public String toString() {
		return "SubjectEntity [subjectId=" + subjectId + ", name=" + name + "]";
	}

}
