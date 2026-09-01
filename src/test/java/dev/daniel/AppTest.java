package dev.daniel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;


public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        App app = new App();
        App.main(null);
        assertThat(1, is(equalTo(1)));
        assertThat(app, is(instanceOf(App.class)));
    }

    @Test
    public void shouldTestTheApp() 
    {
        
    }
}
