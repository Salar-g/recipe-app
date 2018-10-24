package sal.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sal.springframework.recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository <UnitOfMeasure, Long> {


    Optional<UnitOfMeasure> findByDescription(String description);
}
