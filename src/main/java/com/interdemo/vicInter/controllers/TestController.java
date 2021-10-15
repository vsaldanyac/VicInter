package com.interdemo.vicInter.controllers;

import com.interdemo.vicInter.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

  private final TestService testService;

  @Autowired
  public TestController(TestService _testService) {
    this.testService = _testService;

  }

  @GetMapping("/v1/test")
  public ResponseEntity<?> testingApp() {

    return new ResponseEntity<>(testService.testingDBAccess(), HttpStatus.OK);
  }
}

