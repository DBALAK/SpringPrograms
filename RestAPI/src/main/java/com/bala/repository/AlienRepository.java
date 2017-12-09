package com.bala.repository;

import java.util.ArrayList;
import java.util.List;

import com.bala.Alien;

public class AlienRepository {

	List<Alien> aliens;

	public AlienRepository() {
		aliens = new ArrayList<Alien>();
		Alien a1 = new Alien();
		a1.setId(4);
		a1.setName("dhana");
		a1.setPoints(100);

		Alien a2 = new Alien();
		a2.setId(5);
		a2.setName("suma");
		a2.setPoints(90);
		aliens.add(a1);
		aliens.add(a2);
	}

	public List<Alien> getAliens() {
		return aliens;
	}

	public Alien getAlien(int id) {
		Alien a1 = null;

		for (Alien a : aliens) {
			if (a.getId() == id) {
				return a1;
			}
		}
		return null;
	}

	public Alien createAlien(Alien a1) {
		aliens.add(a1);
		return null;
	}

}
