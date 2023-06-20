package com.github.lawlie8;

import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CurrencyTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.currency().name(), matchesRegularExpression("[\\w\\'\\.\\-\\(\\) ]+"));
    }

    @Test
    public void testCode() {
        final Currency currency = faker.currency();
        assertThat(currency.code(), matchesRegularExpression("[A-Z]{3}"));
    }

}
