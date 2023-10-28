package co.com.crudanimal.usecase.crudanimal;
import co.com.crudanimal.model.animal.Animal;
import co.com.crudanimal.model.animal.gateways.AnimalRepository;
import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class CrudAnimalUseCase {
    private AnimalRepository animalRepository;
    public void create(Animal animal){animalRepository.create(animal);}
    public Animal read(String name){ return animalRepository.read(name);}
    public Animal update(String name, Animal animal) throws Exception {
        animalRepository.update(name, animal);
        return animal;
    }
    public void delete(String name) {animalRepository.delete(name);}
    public List<Animal> getAll() {return animalRepository.getAll();}
}

