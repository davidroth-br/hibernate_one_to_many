package main;

import entities.Program;
import entities.Student;
import org.hibernate.Session;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Program prog1 = new Program(425, "Java Persistence API with Framework Hibernate", 9);
        session.save(prog1);

        Student stnt1 = new Student(1, "David", "Roth", "davidroth.br@gmail.com", prog1);
        Student stnt2 = new Student(2, "Nobody", "Atall", "nobody.atall@nowhere.com", prog1);
        session.save(stnt1);
        session.save(stnt2);

        session.getTransaction().commit();
        session.close();
    }
}
