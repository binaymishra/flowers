package com.flower;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flower.components.IdGenerator;

@RestController
public class FlowerController {

  @Autowired
  @Qualifier("counterIdGenerator")
  private IdGenerator counterIdGenerator;

  @RequestMapping("/flower")
  public List<Flower> flowers(){
    List<Flower> flowers = new ArrayList<Flower>();
    int id = 0;
    id = (int) counterIdGenerator.generateId();
    flowers.add(new Flower(id, "Rose"));
    id = (int) counterIdGenerator.generateId();
    flowers.add(new Flower(id, "Lotus"));
    return flowers;
  }

}
