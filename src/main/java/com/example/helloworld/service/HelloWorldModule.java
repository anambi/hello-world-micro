package com.example.helloworld.service;

import com.example.helloworld.service.impl.HelloWorldServiceImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class HelloWorldModule {

  @Provides
  @Singleton
  static HelloWorldService provideHelloWorld() {
    return new HelloWorldServiceImpl();
  }

}
