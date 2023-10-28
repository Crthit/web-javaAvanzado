package co.com.crudanimal.jpa;

import co.com.crudanimal.jpa.entities.AnimalEntity;
import co.com.crudanimal.jpa.helper.AdapterOperations;
import co.com.crudanimal.model.animal.Animal;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepositoryAdapter extends
        AdapterOperations<Animal,
                AnimalEntity, String, JPARepository>
// implements ModelRepository from domain
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Animal.class));
    }
}
