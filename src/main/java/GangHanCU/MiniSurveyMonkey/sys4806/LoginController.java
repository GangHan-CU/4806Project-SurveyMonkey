package GangHanCU.MiniSurveyMonkey.sys4806;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Autowired
    UserCheck userCheck;

    @GetMapping("/login")
    public User user(@AuthenticationPrincipal OAuth2User principal) {
        User user = userCheck.findByExternalID(principal.getName());

        // If this is a new user, save to db
        if (user == null){
            user = new User();
            user.setExternalID(principal.getName());
            user.setName(principal.getAttribute("name"));
            userCheck.save(user);
        }
        return user;
    }
}
