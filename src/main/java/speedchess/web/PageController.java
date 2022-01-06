package speedchess.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    private final Logger logger = LoggerFactory.getLogger(PageController.class);

    @GetMapping("/")
    public String index() {
        logger.info("Serving index page ...");
        return "index";
    }

    @GetMapping("/image")
    public String getImage() {
        logger.info("Serving image page ...");
        return "image";
    }
}
