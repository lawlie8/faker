package com.github.lawlie8;

import org.junit.Test;

import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

/**
 * @author Luka Obradovic (luka@vast.com)
 */
public class LordOfTheRingsTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.lordOfTheRings().character(), matchesRegularExpression("(?U)([\\w ]+ ?)+"));
    }

    @Test
    public void location() {
        assertThat(faker.lordOfTheRings().location(), matchesRegularExpression("(?U)([\\w'\\- ]+ ?)+"));
    }
}
