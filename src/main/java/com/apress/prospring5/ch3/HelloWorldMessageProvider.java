package com.apress.prospring5.ch3;

import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

  @Override
  public String getMessage() {
    return "Hello World!";
  }
}
