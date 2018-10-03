package virtual_pets_amok;

public class VirtualPet implements Walking, feedPets, waterPets {

	private String petName;
	private static String petType;
	private static int petHunger;
	private static int petThirst;
	private static int petOil;
	private static int petHealth;
	private static int petHappiness;
	private static boolean petAlive;
	private int litterBoxCleanliness;
	private int cageCleanliness;

	public VirtualPet(String petName, String petType, int petHunger, int petThirst, int petHealth, int petHappiness,
			boolean petAlive) {
		this.petName = petName;
		this.petType = petType;
		this.setPetHealth(petHealth);
		this.setPetHappiness(petHappiness);
		this.setPetAlive(petAlive);
	}

	public VirtualPet(String petName, String petType) {
		this.petName = petName;
		this.petType = petType;
		this.setPetHealth(10);
		this.setPetHappiness(10);
		this.petOil = 10;
		this.petHunger = 15;
		this.petThirst = 10;
		this.setPetAlive(true);
		this.cageCleanliness = 15;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public static int getPetHunger() {
		return petHunger;
	}

	public static int getPetThirst() {
		return petThirst;
	}

	public void oilPet() {
		petOil += 15;
	}

	public static int getPetHealth() {
		return petHealth;
	}

	public static int getPetHappiness() {
		return petHappiness;
	}

	public boolean getPetAlive() {
		if (getPetHealth() < 1) {
			setPetAlive(false);
		}
		return isPetAlive();
	}

	// timeTick
	public String timeTick() {
		petHunger -= 1;
		petThirst -= 1;
		petHappiness -= 1;
		petHealth -= 1;
		petOil -= 1;
		litterBoxCleanliness -= 1;
		cageCleanliness -= 1;
		addLitter();

		return (petName + petType + getPetHunger() + getPetThirst() + getPetHealth() + getPetHappiness() + isPetAlive()
				+ getRobotOil() + getLitterBoxCleanliness() + getCageCleanliness());
	}

	private int getRobotOil() {

		return petOil;
	}

	// Method playWithPets
	public void playWithPets() {
		setPetHappiness(getPetHappiness() + 5);
		setPetHealth(getPetHealth() + 1);
	}

	public String walkPets() {
		setPetHunger(getPetHunger() - 5);
		setPetThirst(getPetThirst() - 3);
		setPetHappiness(getPetHappiness() + 10);
		setPetHealth(getPetHealth() + 1);
		return (petName + petType + getPetHunger() + getPetThirst() + getPetHealth() + getPetHappiness()
				+ isPetAlive());
	}

	public void waterPet() {
		setPetHunger(getPetHunger() + 5);
		setPetThirst(getPetThirst() + 1);
		setPetHappiness(getPetHappiness() + 2);
		setPetHealth(getPetHealth() + 1);
	}

	public void feedPet() {
		setPetHunger(getPetHunger() + 1);
		setPetThirst(getPetThirst() + 5);
		setPetHappiness(getPetHappiness() + 1);
		setPetHealth(getPetHealth() + 1);
		cageCleanliness -= 1;
		litterBoxCleanliness -= 1;
	}

	public void setPetHunger(int petHunger) {
		VirtualPet.petHunger = petHunger;
	}

	public void setPetThirst(int petThirst) {
		VirtualPet.petThirst = petThirst;
	}

	public void setPetHappiness(int petHappiness) {
		VirtualPet.petHappiness = petHappiness;
	}

	public void setPetHealth(int petHealth) {
		VirtualPet.petHealth = petHealth;
	}

	public void setPetType(String petType) {
		VirtualPet.petType = petType;
	}

	public static boolean isPetAlive() {
		return petAlive;
	}

	public void setPetAlive(boolean petAlive) {
		VirtualPet.petAlive = petAlive;
	}

	public String getPetType(String petType) {
		return petType;
	}

	public String getPetName(String petName) {
		return petName;
	}

	@Override
	public void walkDogs() {
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

	public int getLitterBoxCleanliness() {
		return litterBoxCleanliness;
	}

	public void cleanLitterBox() {
		litterBoxCleanliness = 0;
	}

}