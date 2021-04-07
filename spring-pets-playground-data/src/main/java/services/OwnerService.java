package services;

import handler.springframework.springpetsplayground.model.Owner;

/**
 * Created by Evan on 04 / 2021
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
