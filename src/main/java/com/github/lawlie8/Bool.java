package com.github.lawlie8;

public class Bool {
    private final Faker faker;

    protected Bool(Faker faker) {
        this.faker = faker;
    }

    public boolean bool() {
        return faker.random().nextBoolean();
    }
}
