package handler.springframework.springpetsplayground.services.map;

import handler.springframework.springpetsplayground.model.Specialty;
import handler.springframework.springpetsplayground.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Evan on 11/2/2021
 */
@Service
public class SpecialtiesMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
