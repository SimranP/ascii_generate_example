package hello;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> greeting() {
        Map<String, String> stringObjectMap = Collections.singletonMap("message", "Welcome World");
         return stringObjectMap;
    }

}