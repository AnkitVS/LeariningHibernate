package org.learn.LearningHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //System.out.print(sessionFactory);
        
		/*
		 * StudentEntity stuEnt = new StudentEntity(); stuEnt.setName("Rahul");
		 * stuEnt.setStandard(7);
		 * 
		 * SubjectEntity subEnt = new SubjectEntity(); subEnt.setName("Maths");
		 * 
		 * FacultyEntity facEnt= new FacultyEntity(); facEnt.setName("Mathur");
		 * facEnt.setSubject(subEnt);
		 * 
		 * FacultyEntity facEnt1 = new FacultyEntity(); facEnt1.setName("Sharma");
		 * facEnt1.setSubject(subEnt);
		 * 
		 * List<FacultyEntity> fac = new ArrayList<FacultyEntity>(); fac.add(facEnt);
		 * fac.add(facEnt1); subEnt.setFaculty(fac);
		 */
        
        Session session = sessionFactory.openSession();
        Transaction tx =session.beginTransaction();
		/*
		 * session.save(stuEnt); session.save(subEnt); session.save(facEnt);
		 * session.save(facEnt1);
		 */
        
        //Getting all the faculty of one subject
        SubjectEntity subject = (SubjectEntity)session.get(SubjectEntity.class, 1);
        System.out.println(subject.getSubjectId());
        System.out.println(subject.getName());
        for(FacultyEntity f:subject.getFaculty())
        System.out.println(f.getName());
        
        
        tx.commit();
        session.close();
        sessionFactory.close();
        
    }
}
