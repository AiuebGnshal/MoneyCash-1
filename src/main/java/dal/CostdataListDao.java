package dal;

import dao.CostdataList;

import java.util.List;

public interface CostdataListDao {
    void save(CostdataList entity);

    List<CostdataList> findAll();

}

