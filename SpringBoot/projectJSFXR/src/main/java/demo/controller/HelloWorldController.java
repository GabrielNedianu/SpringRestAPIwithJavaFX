package demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
  
  //@RequestMapping("/")
  //String home() {
   // return "Hello World!";
  //}
  
  @RequestMapping("/hello")
  String home1() {
    return "Hello World111!";
  }
  
  @RequestMapping("/helloPerson")
  String homeName() {
    return "Hello";
  }
    
  @PostMapping("/api/post")
  public Integer setNumbers(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b ) {
      Integer sum = a + b;
      return sum;
  }  
    
  }


