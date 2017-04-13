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
    private Costdata costdata;

    public CostdataList() {

    }

    public CostdataList(int id2, int date, int id, int money, Costdata costdata) {
        this.id2 = id2;
        this.date = date;
        this.id = id;
        this.money = money;
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


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_costdata", nullable = false)
    public Costdata getCostdata() {
        return costdata;
    }

    public void setCostdata(Costdata costdata) {
        this.costdata = costdata;
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


//
//
//
//
//
//package dao;
//
//        import org.apache.commons.lang3.builder.ToStringBuilder;
//
//        import javax.persistence.*;
//
//@Entity
//@Table(name = "POST", schema = "JAVA_TASK")
//public class Post {
//    private long id;
//    private User user;
//    private String title;
//    private String publication;
//
//    public Post() {
//    }
//
//    public Post(long id, User user, String title, String publication) {
//        this.id = id;
//        this.user = user;
//        this.title = title;
//        this.publication = publication;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID", nullable = false, unique = true)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "USER_ID", nullable = false)
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    @Column(name = "TITLE", length = 100, nullable = false, unique = false)
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    @Column(name = "PUBLICATION", length = 500, nullable = false, unique = false)
//    public String getPublication() {
//        return publication;
//    }
//
//    public void setPublication(String publication) {
//        this.publication = publication;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this)
//                .append("id", id)
//                .append("user", user)
//                .append("title", title)
//                .append("publication", publication)
//                .toString();
//    }
//}
