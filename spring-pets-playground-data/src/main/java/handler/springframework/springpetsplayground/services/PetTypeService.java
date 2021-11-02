package handler.springframework.springpetsplayground.services;

import handler.springframework.springpetsplayground.model.PetType;
import org.springframework.stereotype.Service;

/**
 * Created by Evan on 04 / 2021
 */
@Service
public interface PetTypeService extends CrudService<PetType, Long> {
}
