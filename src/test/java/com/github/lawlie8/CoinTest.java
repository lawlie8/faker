package com.github.lawlie8;

import static org.junit.Assert.assertThat;
import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;

import org.junit.Test;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void coinFlip() {
        assertThat(faker.coin().flip(), matchesRegularExpression("\\w+"));
    }
}