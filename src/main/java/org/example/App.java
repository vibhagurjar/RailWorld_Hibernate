package org.example;

/**
 * Hello world!
 *
 */


//import com.mysql.cj.xdevapi.SessionFactory;
//import org.apache.maven.api.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("vibha");
        s1.setSem("7th");
        session.save(s1);

        transaction.commit();
        session.close();


    }
}