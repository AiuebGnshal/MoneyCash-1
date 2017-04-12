package service;

import dal.CostdataListDao;
import dao.CostdataList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostdataListService {

    @Autowired
    private CostdataListDao costdataListDao;

    public void saveNewCostdataList(CostdataList costdataList) {

    }
}
