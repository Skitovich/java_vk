package ru.netology.domain;

public class OwnerPost {
    private boolean visibility;
    private String ownerPostGroupOrPerson;
    private int Id;

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public String getOwnerPostGroupOrPerson() {
        return ownerPostGroupOrPerson;
    }

    public void setOwnerPostGroupOrPerson(String ownerPostGroupOrPerson) {
        this.ownerPostGroupOrPerson = ownerPostGroupOrPerson;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
