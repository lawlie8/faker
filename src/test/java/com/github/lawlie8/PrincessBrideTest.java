package com.github.lawlie8;

import org.junit.Test;

import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class PrincessBrideTest extends AbstractFakerTest {
    @Test
    public void character() {
        assertThat(faker.princessBride().character(), matchesRegularExpression("[A-Za-z .-]+"));
    }

    @Test
    public void quote() {
        assertThat(faker.princessBride().quote(), not(isEmptyOrNullString()));
    }
}
