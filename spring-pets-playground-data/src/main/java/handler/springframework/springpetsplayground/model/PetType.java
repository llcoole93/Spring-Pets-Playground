package handler.springframework.springpetsplayground.model;

/**
 * Created by Evan on 03 / 2021
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
