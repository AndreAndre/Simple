import HiberPack.ResidentsEntity;
import org.hibernate.Session;

import java.sql.Date;

/**
 * Created by Andre on 03.11.2016.
 */
public class Solution {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        ResidentsEntity res = new ResidentsEntity();
       // res.setId(20);
        res.setApartmentId(20);
        res.setName("Nick");
        res.setSecondName("Dick");
        res.setLastName("Frick");
        res.setBirthday(Date.valueOf("1880-11-12"));
        res.setSexId(1);

        session.save(res);
        session.beginTransaction();
        System.out.println("после бегин");
        session.getTransaction().commit();
        System.out.println("после комит");
        session.close();
        System.out.println("после close");

        System.out.println("после всего");

        HibernateSessionFactory.shutdown();
    }

}
