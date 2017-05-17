package ca.uqam.inf4375;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class HelloController {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }

    @RequestMapping("/")
    public String hello(Map<String, Object> model) {
        // Inject variables into template
        model.put("name", "Alex");
        // Return the name of the template to render (see resources/templates/hello.html)
        return "hello";
    }

    @RequestMapping("/list")
    public String list(Map<String, Object> model) {
        List<Integer> values = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            values.add(i);
        }
        model.put("values", values);
        return "list";
    }
    
}
