package dao;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "COSTDATALIST", schema = "COSTS")
public class CostdataList {
    private int id2;
    private int date;
    private int id;
    private int money;
    private Set<Costdata> costdatas = null;

    public CostdataList() {

    }

    public CostdataList(int id2, int date, int id, int money, Set<Costdata> costdatas) {
        this.id2 = id2;
        this.date = date;
        this.id = id;
        this.money = money;
        this.costdatas = costdatas;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "DATE", nullable = false, unique = false)
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Column(name = "ID2", nullable = false, unique = false)
    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    @Column(name = "MONEY", nullable = false, unique = false)
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "name")
    public Set<Costdata> getCostdatas() {
        return costdatas;
    }

    public void setCostdatas(Set<Costdata> costdatas) {
        this.costdatas = costdatas;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("date", date)
                .append("id2", id2)
                .append("money", money)
                .toString();
    }
}
