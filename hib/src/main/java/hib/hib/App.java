package hib.hib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();
        
        SessionFactory fact = cfg.buildSessionFactory();
        
        System.out.println(fact);
    }
}
