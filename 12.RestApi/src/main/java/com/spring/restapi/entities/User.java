package com.spring.restapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity(name = "THEUSER")
public class User {

    @Id
    @GeneratedValue
    private int id;
    @Size(min = 2, message = "Name should be atleast 2 characters Long")
    private String name;

    @Past(message = "Birth Date must be a past date")
    @JsonProperty("dob")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.birthDate = builder.birthDate;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNaam(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public static class Builder {
        private int id;
        private String name;
        private LocalDate birthDate;

        public Builder() {}

        public User.Builder setId(int id) {
            this.id = id;
            return this;
        }

        public User.Builder setName(String name) {
            this.name = name;
            return this;
        }

        public User.Builder setBirthDate(LocalDate date) {
            this.birthDate = date;
            return  this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(birthDate, user.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
