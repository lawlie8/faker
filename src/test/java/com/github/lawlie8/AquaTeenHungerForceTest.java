package com.github.lawlie8;

import org.junit.Test;

import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class AquaTeenHungerForceTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.aquaTeenHungerForce().character(), matchesRegularExpression("[A-Za-z .]+"));
    }

}
