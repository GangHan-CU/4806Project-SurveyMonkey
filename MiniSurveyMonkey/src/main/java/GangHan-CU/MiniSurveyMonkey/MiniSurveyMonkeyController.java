package Group28.MiniSurveyMonkey;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiniSurveyMonkeyController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Welcome to MiniSurvey Monkey!";
    }

}
