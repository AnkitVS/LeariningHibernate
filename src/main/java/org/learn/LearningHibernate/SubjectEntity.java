package org.learn.LearningHibernate;

import jakarta.persistence.*;

@Entity
@Table(name="subject")
public class SubjectEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subjectId;
	
	@Column(name="subjectName")
	private String name;
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
