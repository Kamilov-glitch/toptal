package domain.data;

import domain.Developer;
import org.springframework.data.repository.CrudRepository;


public interface DeveloperRepository extends CrudRepository<Developer, Long> {
    
}
