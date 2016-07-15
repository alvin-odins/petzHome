package petzHome;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class PetHomeFunctions {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String newPet[];
    int front = 0, rear = 0, numberOfPets, count = 0;
	String pets;
    
	
	public PetHomeFunctions() {
		int capacity = 20;
		numberOfPets = capacity;
		newPet = new String[numberOfPets];
	}

    void registerNewPet() {
        try {
            if (count < numberOfPets) {
                System.out.println("Enter the name and breed of dog (e.g Bruno_Alsatian) :");
                pets = br.readLine();
                newPet[rear] = pets;
                int petName = rear++;
                count++;
                Thread.sleep(2000);
                System.out.println("Welcome to PetzHome: "+ newPet[petName]);
                System.out.println();
            } else {
                System.out.println("We are at full capacity now");
            }
        } catch (Exception e) {
            System.out.println("Please verify your inputs");
        }
    }

    void remove() {
        if (count != 0) {
            System.out.println("Say GoodBye to :" + newPet[front]+" as he goes to a new home");
            front++;
            count--;
        } else {
        	System.out.println("--------------------------");
            System.out.println("There are no pets in the home");
            System.out.println("--------------------------\n");
        }
        if (rear == numberOfPets) {
            rear = 0;
        }
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