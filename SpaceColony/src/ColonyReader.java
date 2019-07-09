import java.io.FileNotFoundException;

/*
 * The ColonyReader parses the input data from two text files. It generates the
 * planets and queue of applicants based on one file of comma separated values
 * about applicants and the other about each planet. Then it gives SpaceWindow
 * this queue in order to tie everything together.he ColonyReader Class will
 * read from the input file It is responsible for parsing the input about the
 * planets and the people applying to live on them.
 */
public class ColonyReader {
    private Planet[] planets;
    private ArrayQueue<Person> queue;


    /*
     * Send the applicant input file to readQueueFile to populate an
     * ArrayQueue<Person> for the colony and send the planet input file to
     * readPlanetFile to populate an array of planets for the colony.
     *
     * Instantiate a new SpaceWindow with the recently filled colony as its
     * parameter.
     */
    public ColonyReader(String applicantFileName, String planetFileName)
        throws FileNotFoundException {

    }

}
