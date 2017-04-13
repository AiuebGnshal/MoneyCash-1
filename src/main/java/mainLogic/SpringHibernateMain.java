package mainLogic;

import dal.CostdataDao;
import dal.CostdataListDao;
import dao.Costdata;
import dao.CostdataList;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class SpringHibernateMain {
    public static void main (String [] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

        CostdataListDao costdataListDao = context.getBean(CostdataListDao.class);
        CostdataDao costdataDao = context.getBean(CostdataDao.class);


        Costdata newCostdata = new Costdata();
        newCostdata.setId(1);
        newCostdata.setName("name1");


        CostdataList newCostdataList = new CostdataList();
        newCostdataList.setCostdata(newCostdata);
        newCostdataList.setId(1);
        newCostdataList.setDate(5);
        newCostdataList.setId2(1);
        newCostdataList.setMoney(1000);


        costdataListDao.save(newCostdataList);
        costdataDao.save(newCostdata);

    }
}
