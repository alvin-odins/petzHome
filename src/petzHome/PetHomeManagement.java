package petzHome;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class PetHomeManagement {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int front = 0, rear = 0, numberOfPets, count = 0;    
	
	public PetHomeManagement() {
		int capacity = 20;
		numberOfPets = capacity;
	}

}