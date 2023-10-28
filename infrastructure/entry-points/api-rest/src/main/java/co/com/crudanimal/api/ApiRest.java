package co.com.crudanimal.api;
import lombok.AllArgsConstructor;
import co.com.crudanimal.model.animal.Animal;
import co.com.crudanimal.usecase.crudanimal.CrudAnimalUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final CrudAnimalUseCase crudAnimalUseCase;

    @GetMapping(path = "/path")
    public String commandName() {
        return "Hello World";
    }

    @GetMapping(path = "/animal/{id}")
    public Animal read(@PathVariable String id) {
        return crudAnimalUseCase.read(id);
    }

    @PostMapping(path = "/animal")
    public void create(@RequestBody Animal animal) {
        crudAnimalUseCase.create(animal);
    }

    @GetMapping(path = "/animal")
    public List<Animal> getAll() {
        return crudAnimalUseCase.getAll();
    }
    @PutMapping(path = "/animal/{id}")
    public void update(@PathVariable String id, @RequestBody Animal animal) {
        try {
            crudAnimalUseCase.update(id, animal);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @DeleteMapping(path = "/animal/{id}")
    public void delete(@PathVariable String id) {
        crudAnimalUseCase.delete(id);
    }

}
