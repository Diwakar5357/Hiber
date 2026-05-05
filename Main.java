package com.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//       Student std=new Student();
//       std.setSid(600);
//       std.setSname("Reddy");
//       std.setTech("Java3");
       Configuration conf=new Configuration();
       conf.addAnnotatedClass(com.example.Student.class);
       conf.configure();
       SessionFactory factory=conf.buildSessionFactory();
       Session session= factory.openSession();
//       Transaction transaction=session.beginTransaction();
//       session.persist(std);
//       transaction.commit();

       Student std=session.find(Student.class ,300);
       System.out.println(std);

       session.close();
       factory.close();
    }
}