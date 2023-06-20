package com.github.lawlie8;

public class AquaTeenHungerForce {

    private final Faker faker;

    protected AquaTeenHungerForce(Faker faker) {
        this.faker = faker;
    }

    public String character() {
        return faker.fakeValuesService().resolve("aqua_teen_hunger_force.character", this, faker);
    }

}
