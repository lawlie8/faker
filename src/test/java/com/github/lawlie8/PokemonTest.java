package com.github.lawlie8;

import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PokemonTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.pokemon().name(), matchesRegularExpression("[\\w']+.?( \\w+)?"));
    }

    @Test
    public void location() {
        assertThat(faker.pokemon().location(), matchesRegularExpression("\\w+( \\w+)?( \\w+)?"));
    }
}
