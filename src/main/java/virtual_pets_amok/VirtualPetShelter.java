package virtual_pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	// Pet Map
	private Map<String, VirtualPet> petMap = new HashMap<String, VirtualPet>();
	private Object petType;

	public VirtualPet getPetType(String petType) {
		return petMap.get(petType);
	}

	private int litterBoxCleanliness = 0;
	private int cageCleanliness = 25;

	public int getLitterBoxCleanliness() {
		return litterBoxCleanliness;
	}

	public void cleanLitterBox() {
		setLitterBoxCleanliness(0);
	}

	public Map<String, VirtualPet> getPetMap() {
		return petMap;
	}

	public void addPet(VirtualPet pet) {
		petMap.put(pet.getPetName(), pet);
	}

	public boolean hasPets() {
		return !petMap.isEmpty();
	}

	public Collection<VirtualPet> petCollection() {
		return petMap.values();
	}

	public VirtualPet getPetByName(String petName) {
		return petMap.get(petName);
	}

	// Adopt Pet
	public void adoptPet(String petName) {
		petMap.remove(petName);
	}

	// Add pet
	public void acceptPet(VirtualPet newPet) {
		petMap.put(newPet.getPetName(), newPet);
	}

	public void intake(VirtualPet newPet) {
		petMap.put(newPet.getPetName(), newPet);
	}

	// timeTick
	public void timeTickShelter() {
		for (VirtualPet instance : petMap.values())
			instance.timeTick();
	}

	// Do Nothing
	public void doNothing() {
		for (VirtualPet instance : petMap.values()) {
			instance.timeTick();
		}
	}

	// Quit
	public void quitGame() {
		System.exit(0);
	}

	public void feedPets() {
		for (VirtualPet instance : petMap.values()) {
			if (instance instanceof virtual_pets_amok.feedPets) {
				((virtual_pets_amok.feedPets) instance).feedPet();
			}

		}
		for (VirtualPet instanceCat : petMap.values()) {
			if (instanceCat instanceof OrganicCat) {
				setLitterBoxCleanliness(getLitterBoxCleanliness() - 1);
			}
		}

		for (VirtualPet instanceDog : petMap.values()) {
			if (instanceDog instanceof OrganicDog) {
				cageCleanliness -= 1;
			}
		}
	}

	public void oilRobots() {
		for (VirtualPet instance : petMap.values()) {
			if (instance instanceof virtual_pets_amok.RobotInterface) {
				((virtual_pets_amok.RobotInterface) instance).oilPet();
			}
		}
	}

	public void waterPets() {
		for (VirtualPet instance : petMap.values()) {
			if (instance instanceof virtual_pets_amok.feedPets) {
				((virtual_pets_amok.waterPets) instance).waterPet();
			}
		}
	}

	public void playWithPets() {
		for (VirtualPet instance : petMap.values()) {
			instance.playWithPets();
		}

	}

	public void crematePet(String petName) {
		petMap.remove(petName);
	}

	public void walkPets() {
		for (VirtualPet instance : petMap.values()) {
			if (instance instanceof VirtualPet) {
				((VirtualPet) instance).walkPets();
			}
		}
	}

	public Object getPetType() {
		return petType;
	}

	public void setPetType(Object petType) {
		this.petType = petType;

	}

	public void cleanOrganicDogs() {
		for (VirtualPet instance : petMap.values()) {
			if (instance instanceof VirtualPet) {
				((VirtualPet) instance).cleanOrganicDogs();
			}
		}
	}

	public void setLitterBoxCleanliness(int litterBoxCleanliness) {
		this.litterBoxCleanliness = litterBoxCleanliness;
	}

}
