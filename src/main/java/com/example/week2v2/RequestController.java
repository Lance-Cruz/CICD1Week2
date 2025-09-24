package com.example.week2v2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        return "Name: " + name + ", Age: " + age;
    }

    @GetMapping("/person")
    public Person getPerson(){
        return new Person("Lance", 20);
    }

    @GetMapping("/calculator")
    public Calculator getCalculator(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation){
        switch (operation){
            case "add":
                return new Calculator("add", num1 + num2);


            default:
                return new Calculator("test", 0);

        }
    }
}
