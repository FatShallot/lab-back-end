package com.lpc.entity.pojo;

import java.util.List;

public class Menu {
    private Integer id;
    private String icon;
    private String description;
    private String path;
    private List<Menu> childMenus;

    public Menu() {
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Menu> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<Menu> childMenus) {
        this.childMenus = childMenus;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", path='" + path + '\'' +
                ", childMenus=" + childMenus +
                '}';
    }
}
