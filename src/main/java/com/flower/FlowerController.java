package com.flower;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {
	
	 private final AtomicInteger counter = new AtomicInteger();
	 
	 @RequestMapping("/flower")
	 public List<Flower> flowers(){
		 List<Flower> flowers = new ArrayList<Flower>();
		 flowers.add(new Flower(counter.incrementAndGet(), "Rose"));
		 flowers.add(new Flower(counter.incrementAndGet(), "Lotus"));
		return flowers;
	 }

}
