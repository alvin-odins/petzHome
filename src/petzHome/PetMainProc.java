package petzHome;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class PetMainProc {

    public static void main(String arg[]) {
    	int option;
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        PetHomeFunctions pets = new PetHomeFunctions();
        
        System.out.println("--------------------------");
        System.out.println("Welcome to the Petz Home.\n"
        		+ "Adopt a new Pet Today");
        System.out.println("--------------------------\n");
        try {
        	
            do {
                System.out.println("1. Add New Pet"
                		+ "\n2. Pet Adoption"
                		+ "\n3. Display"
                		+ "\n4. Exit Petz Home\n");
                System.out.println("--------------------------");
                System.out.println("Selected Option : ");
                option = Integer.parseInt(br.readLine());
                Thread.sleep(1000);
                switch (option) {
                    case 1:
                        pets.registerNewPet();
                        break;
                    case 2:
                        pets.remove();
                        break;
                    case 3:
                        pets.displayAllPets();
                        break;
                }
            } while (option != 4);
        } catch (Exception e) {
            System.out.println("Please choose an option 1, 2, 3, 4");
        }
    }
}