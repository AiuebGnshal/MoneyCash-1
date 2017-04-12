package service;

import dal.CostdataDao;
import dao.Costdata;
import dao.CostdataList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CostdataService {

    @Autowired
    private CostdataDao costdataDaoDao;

    public void saveNewCostdata(Costdata costdata, CostdataList costdataList) {

    }
}
