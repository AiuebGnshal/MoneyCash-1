package dal.impl;
import dal.CostdataListDao;
import dao.CostdataList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CostdataListDaoImpl implements CostdataListDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(CostdataList entity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(entity);

        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    public List<CostdataList> findAll() {
        Session session = this.sessionFactory.openSession();
        List<CostdataList> personList = session.createQuery("from CostdataList").list();
        session.close();
        return personList;
    }
}
