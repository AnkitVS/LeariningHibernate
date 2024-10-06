package org.learn.LearningHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        System.out.print(sessionFactory);
        
        StudentEntity stuEnt = new StudentEntity();
        stuEnt.setName("Rahul");
        stuEnt.setStandard(7);
        
        SubjectEntity  subEnt = new SubjectEntity();
        subEnt.setName("Maths");
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(stuEnt);
        session.save(subEnt);
        session.getTransaction().commit();
        session.close();
        
        
    }
}
