package com.gmail.radzkovevgeni.model;

public class Person {
    private final String name;
    private final String surname;
    private final Integer yearOfBirth;

    private Person(Builder builder) {
        name = builder.name;
        surname = builder.surname;
        yearOfBirth = builder.yearOfBirth;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public static final class Builder {
        private String name;
        private String surname;
        private Integer yearOfBirth;

        private Builder() {
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withSurname(String val) {
            surname = val;
            return this;
        }

        public Builder withYearOfBirth(Integer val) {
            yearOfBirth = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

