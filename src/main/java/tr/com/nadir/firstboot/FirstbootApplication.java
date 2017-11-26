package tr.com.nadir.firstboot;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstbootApplication {

  public static void main(String[] args) {
    SpringApplication.run(FirstbootApplication.class, args);
  }
  @RequestMapping(value = "/")
  public String hello() {
    return "Hello, server time:" + new Date();
  }
}
