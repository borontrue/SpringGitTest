package com.test.springgittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringGitTestApplication {

    public static void main( String[] args ) {
        SpringApplication.run( SpringGitTestApplication.class, args );
    }

}
