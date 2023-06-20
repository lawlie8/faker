package com.github.lawlie8;

import org.junit.Test;

import static com.github.lawlie8.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class BookTest extends AbstractFakerTest {

    @Test
    public void testTitle() {
        assertThat(faker.book().title(), matchesRegularExpression("([\\p{L}'\\-\\?]+[!,]? ?){2,9}"));
    }

    @Test
    public void testAuthor() {
        assertThat(faker.book().author(), matchesRegularExpression("([\\w']+\\.? ?){2,3}"));
    }

    @Test
    public void testPublisher() {
        assertThat(faker.book().publisher(), matchesRegularExpression("([\\p{L}'&\\-]+[,.]? ?){1,5}"));
    }

    @Test
    public void testGenre() {
        assertThat(faker.book().genre(), matchesRegularExpression("([\\w/]+ ?){2,4}"));
    }
}
