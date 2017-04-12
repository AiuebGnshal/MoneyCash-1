package mainLogic;

import dal.CostdataDao;
import dal.CostdataListDao;
import dao.Costdata;
import dao.CostdataList;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateMain {
    public static void main (String [] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

        CostdataListDao costdataListDao = context.getBean(CostdataListDao.class);
        CostdataDao costdataDao = context.getBean(CostdataDao.class);

        CostdataList newCostdataList = new CostdataList();
        newCostdataList.setId(1);
        newCostdataList.setDate(5);
        newCostdataList.setId2(1);
        newCostdataList.setMoney(1000);

        Costdata newCostdata = new Costdata();
        newCostdata.setCostdata(newCostdataList);
        newCostdata.setId(1);
        newCostdata.setName("name1");

        costdataListDao.save(newCostdataList);
        costdataDao.save(newCostdata);

    }
}
