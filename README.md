Virtual Pets Amok!

The class VirtualPet creates an organic cat, robot cat, organic dog, or robot dog pet. All pets have a petName, petType, health, happiness, and alive variables which are decreased using the tick method.

Each organic dog gets its own cage and cage cleanliness will go down, along with its health if you do not regularly clean the pets' cages.

The organic cats all share a litter box.  If the litter box is not regularly cleaned, the health of the cats will also decrease.

The organic and robot dog classes have a Walking interface with increases their health when they are walked.

The robot pets have an RobotInterface which allows you to oil the robot pets instead of feeding and watering them.  If you do not oil robot pets, they will become rusty and their health will go down.

The OrganicDog and OrganicCat classes extend the OrganicPet class. OrganicPet, RobotDog, and RobotCat all extend the VirtualPet class.

Methods for each pet type are implemented via the VirtualPetShelter and the game is played through the VirtualPetShelterApp.

Enjoy!
