package dao;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "COSTDATA", schema = "COSTS")
public class Costdata {
    private int id;
    private String name;
    private Set<CostdataList> costdataLists = null;

    public Costdata() {
    }

    public Costdata(int id, String name, Set<CostdataList> costdataLists) {
        this.id = id;
        this.name = name;
        this.costdataLists = costdataLists;
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

    public String getName () {return name;}
    public void setName(String name) {
        this.name = name;
    }

    public CostdataList getCostdataList() {return (CostdataList) costdataLists;}

    public void setCostdata(Set<CostdataList> costdataLists) {
        this.costdataLists = costdataLists;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "id")
    public Set<CostdataList> getCostdata() {
        return costdataLists;
    }

    public void setPosts(Set<CostdataList> posts) {
        this.costdataLists = posts;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .toString();
    }
}


//
//
//
//package dao;
//
//        import org.apache.commons.lang3.builder.ToStringBuilder;
//
//        import javax.persistence.*;
//        import java.util.HashSet;
//        import java.util.List;
//        import java.util.Set;
//
//@Entity
//@Table(name = "USER", schema = "JAVA_TASK")// схемы таблицы далее создаем как private поля потом геттеры и сеттеры
//public class User {
//    private Long id;
//    private String firstName;
//    private String lastName;
//    private Set<Post> posts = null;//new HashSet<Post>(0);
//
//    public User() {
//
//    }
//
//    public User(Long id, String firstName, String lastName, Set<Post> posts) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.posts = posts;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID", nullable = false, unique = true)
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Column(name = "FIRST_NAME", length = 32, nullable = false, unique = false)
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    @Column(name = "LAST_NAME", length = 32, nullable = false, unique = false)
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
//    public Set<Post> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(Set<Post> posts) {
//        this.posts = posts;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this)
//                .append("id", id)
//                .append("firstName", firstName)
//                .append("lastName", lastName)
//                .append("post", posts)
//                .toString();
//    }
//}
