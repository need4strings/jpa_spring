package academy.mindswap.bootcamp_spring.persistence.repository;

import academy.mindswap.bootcamp_spring.persistence.entity.Workshop;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WorkshopRepository extends CrudRepository<Workshop, Long> {
    @Query(value = "SELECT *, t.name, wt.theme " +
            "FROM workshops AS w " +
            "INNER JOIN workshop_themes AS wt ON w.theme_id = wt.id " +
            "INNER JOIN teachers AS t ON t.id = w.teacher_id", nativeQuery = true)
    List<Workshop> findWorkshops();
}
