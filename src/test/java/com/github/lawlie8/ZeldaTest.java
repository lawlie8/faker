package com.github.lawlie8;

import org.junit.Test;

import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class ZeldaTest extends AbstractFakerTest {

    @Test
    public void game() {
        assertThat(faker.zelda().game(), matchesRegularExpression("[A-Za-z'\\- :]+"));
    }

    @Test
    public void character() {
        assertThat(faker.zelda().character(), matchesRegularExpression("(?U)([\\w'\\-.\\(\\)]+ ?)+"));
    }
}
