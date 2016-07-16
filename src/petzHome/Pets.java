package petzHome;

public class Pets extends PetHomeManagement{
	
	String newPet[], pets;
	
	public Pets() {
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

}
