package academy.mindswap.bootcamp_spring.persistence.entity;

import javax.persistence.*;

@Entity(name = "presentations")
@Table(name = "presentations")
public class Presentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long presentationId;

    @Column(name = "date_to_present", nullable = false)
    private String date;

    @Column(name = "theme_id", nullable = false)
    private Integer theme_id;

    @Column(name = "student_id_card", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer studentIdCard;

    @ManyToOne
    @JoinColumn(name = "theme_id", insertable = false, updatable = false)
    private PresentationThemes presentationThemes;

    @ManyToOne
    @JoinColumn(name = "student_id_card", insertable = false, updatable = false)
    private User user;

    public Presentation() {

    }

    public Long getPresentationId() {
        return presentationId;
    }

    public String getDate() {
        return date;
    }

    public Integer getTheme_id() {
        return theme_id;
    }

    public Integer getStudentIdCard() {
        return studentIdCard;
    }

    public PresentationThemes getPresentationThemes() {
        return presentationThemes;
    }

    public User getUser() {
        return user;
    }
}
