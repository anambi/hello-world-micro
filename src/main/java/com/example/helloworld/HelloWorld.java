package com.example.helloworld;

import com.example.helloworld.service.HelloWorldService;
import io.javalin.Javalin;
import javax.inject.Inject;

public class HelloWorld {

  public static void main(String[] args) {
    //Javalin app = Javalin.create().start(8080);

    //app.get("/", ctx -> ctx.result("Hello World"));

    DaggerHelloWorldComponent
        .create()
        .router()
        .start();
  }
}
