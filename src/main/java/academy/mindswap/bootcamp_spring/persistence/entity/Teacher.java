package academy.mindswap.bootcamp_spring.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "teacher")
    private Set<Workshop> workshops;

    private Teacher() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Workshop> getWorkshops() {
        return workshops;
    }
}
