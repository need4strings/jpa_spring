package academy.mindswap.bootcamp_spring.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "users")
@Table(name = "students")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_card")
    private Long idCard;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    private Integer edition;

    @OneToMany(mappedBy = "user")
    private Set<Presentation> presentation;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public long getIdCard() {
        return idCard;
    }

    public String getName() {
        return name;
    }

    public Integer getEdition() {
        return edition;
    }

    public Set<Presentation> getPresentation() {
        return presentation;
    }
}
