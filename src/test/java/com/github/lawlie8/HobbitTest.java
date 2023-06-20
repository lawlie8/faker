package com.github.lawlie8;

import org.junit.Test;

import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class HobbitTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.hobbit().character(), matchesRegularExpression("^(\\(?\\w+\\.?\\s?\\)?)+$"));
    }

    @Test
    public void thorinsCompany() {
        assertThat(faker.hobbit().thorinsCompany(), matchesRegularExpression("^(\\w+\\s?)+$"));
    }

    @Test
    public void quote() {
        assertFalse(faker.hobbit().quote().isEmpty());
    }

    @Test
    public void location() {
        assertThat(faker.hobbit().location(), matchesRegularExpression("^(\\w+'?-?\\s?)+$"));
    }
}
