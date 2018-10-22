package com.example.helloworld.web;

import com.example.helloworld.service.HelloWorldService;
import io.javalin.Javalin;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Router {

  private HelloWorldService helloWorldService;

  @Inject
  public Router(HelloWorldService helloWorldService) {
    this.helloWorldService = helloWorldService;
  }

  public void start() {
    Javalin app = Javalin.create().start(8080);

    app.get("/", ctx -> ctx.result(helloWorldService.greet()));
  }

}
