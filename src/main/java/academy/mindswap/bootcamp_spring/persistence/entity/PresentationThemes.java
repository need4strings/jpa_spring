package academy.mindswap.bootcamp_spring.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "presentation_themes")
@Table(name = "presentation_themes")
public class PresentationThemes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long presentationThemeId;

    @Column(name = "theme",  nullable = false)
    private String theme;

    @OneToMany(cascade = {CascadeType.ALL},
                orphanRemoval = true,
                mappedBy = "presentationThemes"
    )
    private Set<Presentation> presentation;

    public PresentationThemes() {

    }

    public String getTheme() {
        return theme;
    }

    public Long getPresentationThemeId() {
        return presentationThemeId;
    }

    public Set<Presentation> getPresentation() {
        return presentation;
    }
}
