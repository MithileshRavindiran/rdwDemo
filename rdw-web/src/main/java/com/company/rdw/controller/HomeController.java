package com.company.rdw.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by x073880 on 5/5/2017.
 */
@RestController
public class HomeController {

    @Value("${pageController.msg}")
    private String pageControllerMsg;

    @Value("${msg}")
    private String msg;

    @GetMapping("/")
    public String getHome() {
        return msg+pageControllerMsg;
        
      //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
