package shuaicj.hello.cloud.service.bakery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * A bakery service where people can get breads.
 *
 * @author shuaicj 2017/06/06
 */
@SpringBootApplication
// @EnableDiscoveryClient
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
