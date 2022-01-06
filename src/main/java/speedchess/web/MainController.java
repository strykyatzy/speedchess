package speedchess.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class MainController {
    Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/time")
    public String getTime() {
        return LocalTime.now().toString();
    }
}
