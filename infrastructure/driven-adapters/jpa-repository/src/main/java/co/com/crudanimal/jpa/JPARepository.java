package co.com.crudanimal.jpa;

import co.com.crudanimal.jpa.entities.AnimalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<AnimalEntity, String>, QueryByExampleExecutor<AnimalEntity> {
}
