package com.saga.example.catproject;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cat")
public class CatController {

  @GetMapping("/get-cat")
  public ResponseEntity<String> getCat(){
    return ResponseEntity.ok("Get cat Boris");
  }
}
