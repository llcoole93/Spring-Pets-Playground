package handler.springframework.springpetsplayground.model;

public class Specialty extends BaseEntity{
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) { this.description = description; }

    private String description;

}
