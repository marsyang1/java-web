package mvc.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangyuchi on 2016/3/29.
 */
@Controller
public class RootController {

    @RequestMapping("/")
    public String greeting() {
        return "greeting";
    }

}