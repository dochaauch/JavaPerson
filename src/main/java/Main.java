package main.java;


import main.java.entity.Buyer;
import main.java.entity.Order;
import main.java.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.FINEST);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Buyer buyer = new Buyer("max", "email2@exp.com", 17);
        Buyer buyer1 = new Buyer("Svit", "email1@exp.com", 25);
        Buyer buyer2 = new Buyer("docha", "email@exp.com", 44);

        Order order = new Order("iPhone", "new mobile");
        Order order1 = new Order("Samsung", "new android");
        Order order2 = new Order("Xiaomi", "new dream");

        buyer.addOrder(order);
        buyer1.addOrder(order1);
        buyer1.addOrder(order2);
        //buyer2.addOrder(order1); order1.setBuyer(???);

        order.setBuyer(buyer);
        order1.setBuyer(buyer1);
        order2.setBuyer(buyer1);

        session.save(buyer);
        session.save(buyer1);
        session.save(buyer2);

        session.save(order);
        session.save(order1);
        session.save(order2);

        transaction.commit();
        session.close();

        var sessionQ = HibernateUtil.getSessionFactory().openSession();
        int age = 18;
        var query1 = sessionQ.createQuery("FROM Buyer b WHERE b.age > :age", Buyer.class);
        query1.setParameter("age", age);
        var listQ = query1.getResultList();
        System.out.println(listQ);

        var query2 = sessionQ.createQuery("SELECT b.name, o.description FROM Buyer b " +
                "JOIN b.orders o WHERE b.id = 1");
        var listQ2 = query2.getResultList();
        System.out.println(listQ2);

    }
}
