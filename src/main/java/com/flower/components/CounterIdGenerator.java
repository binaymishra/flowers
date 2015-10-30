package com.flower.components;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

@Component("counterIdGenerator")
public class CounterIdGenerator implements IdGenerator {
	
	private final AtomicInteger counter = new AtomicInteger();

	@Override
	public Object generateId() {
		return counter.incrementAndGet();
	}

}
