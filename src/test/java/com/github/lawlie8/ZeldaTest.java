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

    @Test
    public void items() {
        assertThat(faker.zelda().items(), matchesRegularExpression("(?U)([\\w'\\-.\\(\\)]+ ?)+"));
    }

    @Test
    public void locations() {
        assertThat(faker.zelda().locations(), matchesRegularExpression("(?U)([\\w'\\-.\\(\\)]+ ?)+"));
    }
}
