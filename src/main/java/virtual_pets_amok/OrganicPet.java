package virtual_pets_amok;

public class OrganicPet extends VirtualPet implements feedPets, waterPets {

	public OrganicPet(String petName, String petType, int petHunger, int petThirst, int petHealth, int petHappiness,
			boolean petAlive) {
		super(petName, petType, petHunger, petThirst, petHealth, petHappiness, petAlive);
	}

	@Override
	public String toString() {
		return "Pet Name = " + getPetName() + ", Pet Type = " + getPetType() + ", Hunger = " + getPetHunger()
				+ ", Thirst = " + getPetThirst() + ", Health = " + getPetHealth() + ", Happiness = "
				+ getPetHappiness();

	}

	// Method feedPet
	@Override
	public void feedPet() {
		setPetHunger(getPetHunger() + 5);
		setPetThirst(getPetThirst() + 1);
		setPetHappiness(getPetHappiness() + 2);
		setPetHealth(getPetHealth() + 1);
	}

	// Method waterPets
	@Override
	public void waterPet() {
		setPetHunger(getPetHunger() + 1);
		setPetThirst(getPetThirst() + 5);
		setPetHappiness(getPetHappiness() + 1);
		setPetHealth(getPetHealth() + 1);

	}

}
