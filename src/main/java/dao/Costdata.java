package dao;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "COSTDATA", schema = "COSTS")
public class Costdata {
    private int id;
    private String name;
    private CostdataList costdata;

    public Costdata() {
    }

    public Costdata(int id, String name, CostdataList costdata) {
        this.id = id;
        this.name = name;
        this.costdata = costdata;
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

    @Column(name = "NAME", nullable = false, unique = true)

    public void setName(String name) {
        this.name = name;
    }

    public CostdataList getCostdata() {
        return costdata;
    }

    public void setCostdata(CostdataList costdata) {
        this.costdata = costdata;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NAME_ID", nullable = false)
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .toString();
    }
}
