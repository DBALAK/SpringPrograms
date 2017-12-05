package com.di.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IPhoneConfig {

   @Bean	
   public IPhone getTPhone(){
	   return new IPhone();
   }
}
