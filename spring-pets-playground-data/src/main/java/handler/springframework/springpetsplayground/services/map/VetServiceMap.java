package handler.springframework.springpetsplayground.services.map;

import handler.springframework.springpetsplayground.model.Vet;
import handler.springframework.springpetsplayground.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Evan on 4/7/2021
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
