package com.example.helloworld.service.impl;

import com.example.helloworld.service.HelloWorldService;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class HelloWorldServiceImpl implements HelloWorldService {

  @Override
  public String greet() {
    return "Hello World";
  }
}
