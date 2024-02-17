package org.example.pojo;

public class weatherInfo {

    private int id;
    private String main;
    private String description;

    private String icon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getMain() {
        return main;
    }

    public void setMain(java.lang.String main) {
        this.main = main;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public java.lang.String getIcon() {
        return icon;
    }

    public void setIcon(java.lang.String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "weatherInfo{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
