package com.apress.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("app-context-annotation.xml");
    ctx.refresh();

    MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
    mr.render();

    ctx.close();
  }
}
