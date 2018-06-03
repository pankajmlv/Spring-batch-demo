package com.spring.batch.demo.demoapp.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> messages) {
		for (String msg : messages) {
			System.out.println("Writing the data " + msg);
		}
	}

}