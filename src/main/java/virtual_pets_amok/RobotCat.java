package virtual_pets_amok;

public class RobotCat extends VirtualPet implements RobotInterface {

	public RobotCat(String petName, String petType) {
		super(petName, petType);

	}

	private static int petOil;

	@Override
	public String toString() {
		return "Name = " + getPetName() + ", Type = " + getPetType() + ", Oil Level = " + getRobotOil() + ", Health = "
				+ getPetHealth() + ", Happiness = " + getPetHappiness();
	}

	@Override
	public int getRobotOil() {

		return petOil;
	}

	@Override
	public void oilPet() {
		petOil += 15;

	}

}
