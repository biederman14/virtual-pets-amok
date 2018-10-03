package virtual_pets_amok;

public class RobotDog extends VirtualPet implements RobotInterface, Walking {

	public RobotDog(String petName, String petType) {
		super(petName, petType);

	}

	private static int petOil;

	@Override
	public String toString() {
		return "Name = " + getPetName() + ", Type = " + getPetType("Robot Dog") + ", Oil Level = " + getRobotOil()
				+ ", Health = " + getPetHealth() + ", Happiness = " + getPetHappiness();
	}

	public void walkDogs() {
	}

	public void Walking() {
		setPetHunger(getPetHunger() - 5);
		setPetThirst(getPetThirst() - 3);
		setPetHappiness(getPetHappiness() + 10);
		setPetHealth(getPetHealth() + 1);
	}

	@Override
	public int getRobotOil() {
		// TODO Auto-generated method stub
		return petOil;
	}

	@Override
	public void oilPet() {
		petOil += 15;

	}

}
