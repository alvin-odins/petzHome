package petzHome;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class PetHomeManagement {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String newPet[];
    int front = 0, rear = 0, numberOfPets, count = 0;
	//String pets;
    
	
	public PetHomeManagement() {
		int capacity = 20;
		numberOfPets = capacity;
		//newPet = new String[numberOfPets];
	}

   

    

    void displayAllPets() {
        int m = 0, x = 1;
        if (count == 0) {
        	System.out.println("--------------------------");
            System.out.println("The Petz Home is empty");
            System.out.println("--------------------------");
        } else {
        	System.out.print("--------------------------\n");
            for (int i = front; m < count; i++, m++) {
            	//System.out.println("| ");
                //System.out.println(" " + newPet[i]);
                
                System.out.print("| " + x++ + " | ");
    			System.out.println(newPet[i] + " |");
    			System.out.println("--------------------------");
            }
        }
    }
}