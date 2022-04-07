package com.ecommerce.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher implements ApplicationEventPublisherAware {
   private ApplicationEventPublisher publisher;
   
  
   @Autowired
   public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
      this.publisher = publisher;
   }
   public void publish() {
      CustomEvent ce = new CustomEvent(this);
      publisher.publishEvent(ce);
   }
}
