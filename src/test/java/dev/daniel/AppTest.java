package dev.daniel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;


public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertThat(1, is(equalTo(1)));
    }
}
