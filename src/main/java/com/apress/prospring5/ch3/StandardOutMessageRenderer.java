package com.apress.prospring5.ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

  private MessageProvider messageProvider;

  @Override
  public void render() {
      System.out.println("-> calling render() in StandardOutMessageRenderer class");
      if(messageProvider == null) {
        throw new RuntimeException("You must set the provider for " +
                StandardOutMessageRenderer.class.getName());
      }
      System.out.println(messageProvider.getMessage());
  }

  @Override
  @Autowired
  public void setMessageProvider(MessageProvider provider) {
      System.out.println("-> calling setMessageProvider in StandardOutMessageRenderer");
      System.out.println("-> injecting: " + provider.getClass().getName());
      this.messageProvider = provider;
  }

  @Override
  public MessageProvider getMessageProvider() {
    return this.messageProvider;
  }
}
