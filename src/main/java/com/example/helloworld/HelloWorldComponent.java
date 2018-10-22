package com.example.helloworld;

import com.example.helloworld.service.HelloWorldModule;
import com.example.helloworld.web.Router;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {HelloWorldModule.class})
public interface HelloWorldComponent {
  Router router();
}
