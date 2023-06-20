package com.github.lawlie8;

import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DemographicTest extends AbstractFakerTest {

    @Test
    public void race() {
        assertThat(faker.demographic().race(), matchesRegularExpression("(\\w+ ?)+"));
    }

    @Test
    public void educationalAttainment() {
        assertThat(faker.demographic().educationalAttainment(), matchesRegularExpression("(?U)([\\w'-]+ ?)+"));
    }

    @Test
    public void demonym() {
        assertThat(faker.demographic().demonym(), matchesRegularExpression("(?U)([\\w'-]+ ?)+"));
    }

    @Test
    public void maritalStatus() {
        assertThat(faker.demographic().maritalStatus(), matchesRegularExpression("(\\w+ ?)+"));
    }

    @Test
    public void sex() {
        assertThat(faker.demographic().sex(), matchesRegularExpression("\\w+"));
    }
}
