package com.thg.accelerator23.connectn.ai.marije;

import com.thehutgroup.accelerator.connectn.player.Board;
import com.thehutgroup.accelerator.connectn.player.Counter;
import com.thehutgroup.accelerator.connectn.player.Player;
import com.thehutgroup.accelerator.connectn.player.Position;

import java.util.Random;


public class Chancer extends Player {
  public Chancer(Counter counter) {
    //TODO: fill in your name here
    super(counter, Chancer.class.getName());
  }

  @Override
  public int makeMove(Board board) {
    Random random = new Random(8);
    int locationX = random.nextInt();

    while(!board.hasCounterAtPosition(new Position(locationX, 7))) {
      locationX = random.nextInt();
    }
    //TODO: some crazy analysis
    //TODO: make sure said analysis uses less than 2G of heap and returns within 10 seconds on whichever machine is running it
    return locationX;
  }
}
