public class HorseBarn {
    /** The stalls in the barn. Each array element holds a reference to the Horse
     *  that is currently occupying the stall. A null value indicates an empty stall.
     */
    private Horse[] stalls;

    /** Initializes stalls to an array with a length equal to numStalls
     *  (all elements remain null initially)
     *
     *  @param numStalls  the number of stalls in the barn
     */
    public HorseBarn(int numStalls) {
        /* to be implemented in part (a) */
        stalls = new Horse[numStalls];
    }

    /** Assigns stalls to reference sampleHorses
     */
    public HorseBarn(Horse[] sampleStalls) {
        /* to be implemented in part (a) */
        stalls = sampleStalls;
    }

    /** Getter/accessor method for stalls
     *
     *  @return  a references to the stalls array
     */
    // to be added in part (a)
    public Horse[] getStalls() {
        return stalls;
    }

    /** Returns a string that shows which horses are in which stalls
     */
    public String horseBarnInfo() {
        /* to be implemented in part (b) */
        String tempStr= "";
        for (int i = 0; i < stalls.length; i++) {
            tempStr += "Stall " + i + ": ";
            if (stalls[i] == null) {
                tempStr += "empty\n";
            } else {
                tempStr += stalls[i].horseInfo() +"\n";
            }
        }
        return tempStr;
    }

    /** Places a Horse into stalls at the index indicated by stall
     *
     *  PRECONDITION: stall is a valid index of stalls
     *
     *  @param horse  the Horse object to place into stalls
     *  @param stall  the index of stalls to place the Horse
     */
    public void placeHorse(Horse horse, int stall) {
        /* to be implemented in part (c) */
        stalls[stall] = horse;
    }

    /** Returns the index of the stall that contains the horse with the specified name.
     *
     * Precondition: No two horses in the barn have the same name.
     *
     * @param  name the name of the horse to find
     * @return  the index of the stall containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseStall(String name) {
        /* to be implemented in part (d) */
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null) {
                if (stalls[i].getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /** Consolidates the barn by moving horses so that the horses are in adjacent
     *  stalls, starting at index 0, with no empty stall between any two horses.
     *
     *  POSTCONDITION: The order of the horses is the same as before the consolidation.
     */
    public void consolidate() {
        /* to be implemented in part (e) */
        Horse[] tempHorse = new Horse[stalls.length];
        int counter = 0;
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null) {
                tempHorse[counter] = stalls[i];
                counter++;
            }
        }
        stalls = tempHorse;
    }
}

