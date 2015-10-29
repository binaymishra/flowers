package com.flower;

import java.io.Serializable;

/**
 * @author Binay Mishra
 *
 */
public class Flower implements Serializable {

	/**
	 * Model Object for Flower.
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public Flower() {	}

	public Flower(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
