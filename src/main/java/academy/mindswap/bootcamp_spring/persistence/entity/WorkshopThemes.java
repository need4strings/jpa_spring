package academy.mindswap.bootcamp_spring.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "workshop_themes")
public class WorkshopThemes {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "theme")
    private String theme;

    @OneToMany(cascade = {CascadeType.ALL},
            orphanRemoval = true,
            mappedBy = "workshopThemes"
    )
    private Set<Workshop> workshop;

    private WorkshopThemes() {

    }

    public Integer getId() {
        return id;
    }

    public String getTheme() {
        return theme;
    }

    public Set<Workshop> getWorkshop() {
        return workshop;
    }
}
