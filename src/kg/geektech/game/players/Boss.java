package kg.geektech.game.players;

import java.util.Random;

public  class Boss extends GameEntity{
    public static Random random;

    public Boss(int health, int damage) {
        super(health, damage);
    }
}
