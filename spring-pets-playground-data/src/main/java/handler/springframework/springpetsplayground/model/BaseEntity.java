package handler.springframework.springpetsplayground.model;

import java.io.Serializable;

/**
 * Created by Evan on 4/1/2021
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
