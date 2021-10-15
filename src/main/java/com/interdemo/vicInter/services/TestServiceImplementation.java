package com.interdemo.vicInter.services;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImplementation implements TestService {

  @Override public String testingDBAccess() {
    return "DB Access OK";
  }
}
