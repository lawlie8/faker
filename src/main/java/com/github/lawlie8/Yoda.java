package com.github.lawlie8;

public class Yoda {
    private final Faker faker;

    protected Yoda(final Faker faker) {
        this.faker = faker;
    }

    public String quote() {
        return faker.resolve("yoda.quotes");
    }
}
