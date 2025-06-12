package hib.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();    
        SessionFactory fact = cfg.buildSessionFactory();      
        
        Session sess = fact.openSession();
        Transaction tx = sess.beginTransaction();
        
        Student st = new Student(3, "deep", 7.4f, "cse");
        
        sess.persist(st);
        
        tx.commit();
    }
}
