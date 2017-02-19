package com.anisha.corejava.oops;

public class Game {

	private String name;
	private int playersCount;

/*	public Game(String name, int playersCount) {
		this.name = name;
		this.playersCount = playersCount;
	}
*/
	
	
	
	void playingRules() {
		if (name.equalsIgnoreCase("CRICKET") && playersCount == 11) {
			System.out.println("CAN PLAY");
		} else {
			System.out.println("CAN'T  PLAY");
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlayersCount(int playersCount) {
		this.playersCount = playersCount;
	}
}
