package com.apress.prospring5.ch3;

import com.apress.prospring5.ch3.config.HelloWorldConfiguration;
import com.apress.prospring5.ch3.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

    MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
    mr.render();
  }
}
