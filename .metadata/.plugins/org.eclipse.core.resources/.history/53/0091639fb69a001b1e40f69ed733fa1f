package demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import movies.JsonExtractor;
import movies.SearchingMovie;
@RestController
public class HelloWorldController {
  
  //@RequestMapping("/")
  //String home() {
   // return "Hello World!";
  //}
  
  @RequestMapping("/hello")
  String home1() {
	String page = SearchingMovie.findMovie("Lord", true);
	String display = "";
	//display = display + JsonExtractor.getTitle(page) +     /*+ JsonExtractor.getPlot(page) + */   JsonExtractor.getImgSRC(page);	
    return display;
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


