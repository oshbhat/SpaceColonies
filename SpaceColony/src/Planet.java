
/*
 * These objects contain a string, for the planet’s name, three ints for their
 * minimum skill requirements (on a scale of 1 to 5), an array of Person objects
 * for current planet population, an int for storing the current population
 * size, and a final int for the maximum allowed capacity of the planet
 */
public class Planet implements Comparable<Planet> {
    private String name;
    private Skillz minSkills;
    private Person[] population;
    private int populationSize;


    @Override
    public int compareTo(Planet o) {
        // TODO Auto-generated method stub
        return 0;
    }
}
