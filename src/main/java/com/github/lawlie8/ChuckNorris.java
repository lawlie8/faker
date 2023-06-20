package com.github.lawlie8;

public class ChuckNorris {
    private final Faker faker;

    protected ChuckNorris(Faker faker) {
        this.faker = faker;
    }

    public String fact() {
        return faker.fakeValuesService().resolve("chuck_norris.fact", this, faker);
    }
}
