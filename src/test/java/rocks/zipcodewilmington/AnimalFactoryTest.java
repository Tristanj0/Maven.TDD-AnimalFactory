package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    //Structure of a new test
    public void setCreateNewDogTest() {
        //Given (data of Dog)
        String expectedName = "Maggie";
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

     public void setCreateNewCatTest() {
        //Given (
        String expectedName = "Sally";
        Date expectedDate = new Date();
        int expectedNumOfCat = 1;

        //When
        Cat newCat = AnimalFactory.createCat(expectedName, expectedDate);
        CatHouse.add(newCat);
        int actualNumOfCats = CatHouse.getNumberOfCats();

        //Then (what we are testing)
        Assert.assertEquals(actualNumOfCats, expectedNumOfCat);

    }
}


