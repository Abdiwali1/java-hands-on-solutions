package m09_class_object;

/*
    Given a class called AnimalSpecies
    declare these instance variables:
        name, population (double), growth rate (double)
        -> where the unit for the population is 1 million. Ex: 20 population would represent 20 million
        -> where the growth rate is a number percentage. Ex: 2.5 growth rate would be 2.5%

    create a method called calculateInYears that will accept an int year parameter and return the population estimate. Calculate the estimate of what the population will be in the given years based on the growth rate

    create a toString() that shows the information in the following format:
        The $name currently has a population of $population million
        The growth rate is sitting around $rate %, so we predict the population in 5 years will be: $5_year_estimate

    After finishing the AnimalSpecies class uncomment the TestAnimalSpecies class
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalSpecies{

    String name;
    double population; // a million
    double growthRate; // percentage 2.5

    public double calculateInYears(int year){
        return population + population * (growthRate/100) * year;
    }

    public String toString(){
        return "The " + name + " currently has a population of " + population + " million\nThe growth rate is sitting around " + growthRate + " %, so we predict the population in 5 years will be: " + calculateInYears(5);
    }
}


class TestAnimalSpecies extends TestBase {
    public static void main(String[] args) {
        // create AnimalSpecies objects to test your code


    }

    @Test
    public void test1() {
        AnimalSpecies species = new AnimalSpecies();
        species.name = "Lion";
        species.population = 15;
        species.growthRate = 1.5;
        String expected = "The Lion currently has a population of 15.0 million\n" +
                "The growth rate is sitting around 1.5 %, so we predict the population in 5 years will be: 16.125";
        assertEquals(expected, species.toString());
    }

    @Test
    public void test2() {
        AnimalSpecies species = new AnimalSpecies();
        species.name = "Panda";
        species.population = 10;
        species.growthRate = -0.2;
        String expected = "The Panda currently has a population of 10.0 million\n" +
                "The growth rate is sitting around -0.2 %, so we predict the population in 5 years will be: 9.9";
        assertEquals(expected, species.toString());
    }

    @Test
    public void test3() {
        AnimalSpecies species = new AnimalSpecies();
        species.name = "Lion";
        species.population = 15;
        species.growthRate = 1.5;
        double expected = 16.125;
        assertEquals(expected, species.calculateInYears(5));
    }

    @Test
    public void test4() {
        AnimalSpecies species = new AnimalSpecies();
        species.name = "Lion";
        species.population = 15;
        species.growthRate = 1.5;
        double expected = 15.45;
        assertEquals(expected, species.calculateInYears(2));
    }

    @Test
    public void test5() {
        AnimalSpecies species = new AnimalSpecies();
        species.name = "Lion";
        species.population = 15;
        species.growthRate = 1.5;
        double expected = 17.25;
        assertEquals(expected, species.calculateInYears(10));
    }

    @Test
    public void test6() {
        AnimalSpecies species = new AnimalSpecies();
        species.name = "Panda";
        species.population = 10;
        species.growthRate = -0.2;
        double expected = 9.8;
        assertEquals(expected, species.calculateInYears(10));
    }

    @Test
    public void test7() {
        AnimalSpecies species = new AnimalSpecies();
        species.name = "Panda";
        species.population = 10;
        species.growthRate = -1.3;
        double expected = 8.7;
        assertEquals(expected, species.calculateInYears(10));
    }

    @Test
    public void test8() {
        AnimalSpecies species = new AnimalSpecies();
        species.name = "Panda";
        species.population = 10;
        species.growthRate = -0.2;
        double expected = 8.0;
        assertEquals(expected, species.calculateInYears(100));
    }

    @Test
    public void test9() {
        AnimalSpecies species = new AnimalSpecies();
        species.name = "Panda";
        species.population = 10;
        species.growthRate = -1.5;
        double expected = 2.5;
        assertEquals(expected, species.calculateInYears(50));
    }
}
