package Rooms;

import Game.Runner;
import People.Person;

public class SenpaisRoom extends Room{

    public SenpaisRoom(int x,int y){
        super(x,y);
    }

    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the Senapi's room! He ignores you.");
        Runner.gameOff();
    }
}
