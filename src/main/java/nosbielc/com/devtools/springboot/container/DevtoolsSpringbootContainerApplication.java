package nosbielc.com.devtools.springboot.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 21/05/2020
 * @project devtools-springboot-container
 */

@SpringBootApplication
public class DevtoolsSpringbootContainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevtoolsSpringbootContainerApplication.class, args);
    }

    @RestController
    static final class MyController {
        @GetMapping("/universe")
        String universe() {
            return "Hello Universe!\n";
        }

        @GetMapping("/world")
        String world() {
            return "Hello World!\n";
        }

        @GetMapping("/change")
        String change() {
            return "Hello Change!\n";
        }

        @GetMapping("/know")
        String know() {
            return "Hello know with update 14!\n";
        }

        @GetMapping("/last")
        String last() {
            return "Hello last 6!\n";
        }
    }

}
