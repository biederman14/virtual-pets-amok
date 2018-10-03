package virtual_pets_amok;

public class OrganicDog extends OrganicPet implements Walking, feedPets, waterPets {

	private int cageCleanliness;
	// private int getPetType;

	public OrganicDog(String petName, String petType) {
		super(petName, petType, 10, 10, 10, 10, true);
		this.getPetHunger();
		this.getPetThirst();
		this.getCageCleanliness();

	}

	@Override
	public String toString() {
		return "Name = " + getPetName() + ", Type = " + getPetType("Organic Dog") + ", Thirst = " + getPetThirst()
				+ ", Hunger = " + getPetHunger() + ", Health = " + getPetHealth() + ", Happiness = " + getPetHappiness()
				+ ", Cage Cleanliness = " + getCageCleanliness();
	}

	public int getCageCleanliness() {

		return cageCleanliness;
	}

	public void cleanOrganicDogs() {
		cageCleanliness = 20;
	}

	public void addLitter() {
		cageCleanliness -= 1;
	}

	public String walkPets() {

		return (getPetName() + getPetType() + getPetHunger() + getPetThirst() + getPetHealth() + getPetHappiness()
				+ isPetAlive());
	}

	public void Walking() {
		setPetHunger(getPetHunger() - 5);
		setPetThirst(getPetThirst() - 3);
		setPetHappiness(getPetHappiness() + 10);
		setPetHealth(getPetHealth() + 1);
	}

}
