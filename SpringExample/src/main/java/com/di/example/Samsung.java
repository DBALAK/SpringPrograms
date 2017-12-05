package com.di.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component ("samsung")//non qualified and de-captilized name
//@Primary
public class Samsung {

	 @Autowired
	 @Qualifier("mediaTek")
	 MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	
	public void config(){
		System.out.println("Octa core,4 GB RAM");
		cpu.process();
	}
}
