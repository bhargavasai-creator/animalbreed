package animal_breed_species;

/*
 * /public class animalbreedservice {
//
//	public animalbreedservice() {
//		// TODO Auto-generated constructor stub
//	}
*/

public class animalbreedservice {
    private String id;
    private String animal;
    private String breed;
    private String reference;

    public animalbreedservice() {}

    public animalbreedservice(String id, String animal, String breed, String reference) {
        this.id = id;
        this.animal = animal;
        this.breed = breed;
        this.reference = reference;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getAnimal() { return animal; }
    public void setAnimal(String animal) { this.animal = animal; }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }
}