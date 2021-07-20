package academy.mindswap.bootcamp_spring.persistence.entity;

import javax.persistence.*;

@Entity(name = "workshop")
@Table(name = "workshops")
public class Workshop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date_to_present", nullable = false, length = 20)
    private String dateToPresent;

    @Column(name = "theme_id", nullable = false)
    private Integer themeId;

    @Column(name = "edition")
    private Integer edition;

    @Column(name = "teacher_id")
    private Integer teacherId;

    @ManyToOne
    @JoinColumn(name = "theme_id", insertable = false, updatable = false)
    private WorkshopThemes workshopThemes;

    @ManyToOne
    @JoinColumn(name = "teacher_id", insertable = false, updatable = false)
    private Teacher teacher;

    public Workshop() {
    }

    public Long getId() {
        return id;
    }

    public String getDateToPresent() {
        return dateToPresent;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public Integer getEdition() {
        return edition;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public WorkshopThemes getWorkshopThemes() {
        return workshopThemes;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
