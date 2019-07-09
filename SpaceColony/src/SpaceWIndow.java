import java.awt.Color;

/*
 * This object is the front end. Here we build our window, its buttons, and
 * render the Planets and the queue of applicants on the window in a meaningful
 * way. A circle is used to represent every Person in the queue. The color of
 * the circle represents the applicant’s planet preference and will match the
 * corresponding Planet’s representing Shape.
 */
public class SpaceWIndow {

    // private Window window;
    private ColonyCalculator colonyCalculator;
    // private Button accept;
    // private Button reject;
    // private AList<CircleShape> personCircles;
    private static final int PLANET_HEIGHT = 100;
    private static final int QUEUE_STARTX = 70; // The horizontal position which
                                                // starts your queue
    private static final int QUEUE_STARTY = 40; // The vertical position which
                                                // starts your queue
    private static final int CIRCLE_SIZE = 50; // To use to size each Person
                                               // circle.
    private Object[] applicantAr;
    /*
     * private Shape planet1;
     * private Shape planet2;
     * private Shape planet3;
     * private TextShape planetOneDeet;
     * private TextShape planetOneSkills;
     * private TextShape planetTwoDeet;
     * private TextShape planetTwoSkills;
     * private TextShape planetThreeDeet;
     * private TextShape planetThreeSkills;
     * private TextShape applicantInformation;
     */
    private Color color1;
    private Color color2;
    private Color color3;

}
