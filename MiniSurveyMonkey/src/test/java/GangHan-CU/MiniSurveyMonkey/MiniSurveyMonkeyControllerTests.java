package Group28.MiniSurveyMonkey;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MiniSurveyMonkeyControllerTests {

    @Autowired
    private MiniSurveyMonkeyController controller;

    @Test
    void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }
}
