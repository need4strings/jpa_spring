package academy.mindswap.bootcamp_spring.persistence.repository;

import academy.mindswap.bootcamp_spring.persistence.entity.Presentation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PresentationRepository extends CrudRepository<Presentation, Long> {
    @Query(value = "SELECT *, students.name, presentation_themes.theme " +
            "FROM presentations AS p " +
            "INNER JOIN presentation_themes ON p.theme_id = presentation_themes.id " +
            "INNER JOIN students ON students.id_card = p.student_id_card", nativeQuery = true)
    List<Presentation> findPresentations();
}
