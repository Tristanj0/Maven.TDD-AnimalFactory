package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    //Structure of a new test
    public void setCreateNewDogTest() {
        //Given (data of Dog)
        String expectedName = "Ronnie";
        Date expectedDate = new Date();
        int expectedNumOfDog = 1;

        //When (Create a new dog)
        Dog newDog = AnimalFactory.createDog(expectedName, expectedDate); //createDog is coming from the class AnimalFactory
        DogHouse.add(newDog); //adding newDog into DogHouse
        int actualNumOfDogs = DogHouse.getNumberOfDogs();

        //Then (what we are testing)
        Assert.assertEquals(actualNumOfDogs, expectedNumOfDog); // Want to know how many dogs are in the DogHouse

    }

    @Test
    public void getIdTest() {
        //Given (ID of dog)
       String givenName = "Cherry";
       Date givenDate = new Date();
       int givenId = 90;

       //When (Makes new ID)
        Dog dog = new Dog(givenName, givenDate, givenId);
        int actualId = dog.getId();

        //Then (Starts the test)
        Assert.assertEquals(givenId, actualId);

    }

    @Test
    public void speakTest() {
    //Given
        String givenName = "Oliver";
        Date givenDate = new Date();
        int givenId = 0;

    //When
        Dog dog = new Dog(givenName, givenDate, givenId);
        String expectedSpeak = "bark!";
        String actualSpeak = dog.speak();
    //Then
        Assert.assertEquals(expectedSpeak, actualSpeak );
    }
}
