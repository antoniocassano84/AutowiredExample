package com.apress.prospring5.ch3.config;

import com.apress.prospring5.ch3.decoupled.HelloWorldMessageProvider;
import com.apress.prospring5.ch3.decoupled.MessageProvider;
import com.apress.prospring5.ch3.decoupled.MessageRenderer;
import com.apress.prospring5.ch3.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

  @Bean
  public MessageProvider provider() {
    return new HelloWorldMessageProvider();
  }

  @Bean
  public MessageRenderer renderer() {
    MessageRenderer renderer = new StandardOutMessageRenderer();
    renderer.setMessageProvider(provider());
    return renderer;
  }
}
