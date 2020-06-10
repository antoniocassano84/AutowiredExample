package com.apress.prospring5.ch3;

import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider2 implements MessageProvider {

  @Override
  public String getMessage() {
    return "Hello World 222!";
  }
}
