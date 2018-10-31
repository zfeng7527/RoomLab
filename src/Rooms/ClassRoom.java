package Rooms;

import Game.Runner;
import People.Person;
/**
 * Created by Teacher on 10/30/2018.
 */
public class ClassRoom extends Room {
    public ClassRoom(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found Mr. Folwell's Ten points for Hufflepuff.");
        Runner.gameOff();
    }
}
