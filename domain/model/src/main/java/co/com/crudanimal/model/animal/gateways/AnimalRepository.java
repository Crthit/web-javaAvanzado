package co.com.crudanimal.model.animal.gateways;

import co.com.crudanimal.model.animal.Animal;

import java.util.List;
public interface AnimalRepository {
    void create(Animal animal);
    Animal read(String name);
    default Animal update(String name, Animal animal) throws Exception {
        return animal;
    };
    void delete(String name);
    List<Animal> getAll();
}