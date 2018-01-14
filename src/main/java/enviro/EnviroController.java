package enviro;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EnviroController {

        @RequestMapping("/")
        public String index() {
            return "Enviro!";
        }

}
