package com.ecommerce.controller;

//import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.beans.CustomEventPublisher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@Controller
public class MainController {


	       @Autowired
	       private CustomEventPublisher cvp;
        
           @RequestMapping(value = "/customevent", method = RequestMethod.GET)
            public String customEvent(ModelMap map)
            {

                 cvp.publish();  
                 cvp.publish();
                return "Event";
            }
           
}
