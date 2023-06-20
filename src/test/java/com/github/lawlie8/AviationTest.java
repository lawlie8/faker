package com.github.lawlie8;

import org.junit.Test;

import static com.github.lawlie8.matchers.IsStringWithContents.isStringWithContents;
import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class AviationTest extends AbstractFakerTest {

    @Test
    public void airport() {
        assertThat(faker.aviation().airport(), matchesRegularExpression("\\w{4}"));
    }

    @Test
    public void aircraft() {
        assertThat(faker.aviation().aircraft(), isStringWithContents());
    }

    @Test
    public void metar() {
        assertThat(faker.aviation().METAR(), isStringWithContents());
    }
}
