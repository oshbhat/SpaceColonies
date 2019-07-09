
/**
 * This class does the major calculations for the program. It handles the
 * accept/reject logic and contains the queue of applicants and the Planet
 * objects.
 *
 */
public class ColonyCalculator {
    /**
     * static final for the number of planets
     */
    public static final int NUM_PLANETS = 3;
    /**
     * static final for the mininum skill level required
     */
    public static final int MIN_SKILL_LEVEL = 1;
    /**
     * static final for the max skill level requried
     */
    public static final int MAX_SKILL_LEVEL = 5;
    private ArrayQueue<Person> applicantQueue;
    // private AList<Person> rejectBus;
    private static Planet[] planets = new Planet[NUM_PLANETS + 1];

}
