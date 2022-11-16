package kg.geektech.game.general;

import kg.geektech.game.players.SuperAbility;
import kg.geektech.game.players.Warrior;

public class Main {
    public static void main(String[] args) {
        RPG_GAME.startGame();
    }
}


//    Добавить в проект каждому классу героя свою уникальную способность
//        ● Berserk должен получать от босса урон, и потом наносить ему свой урон + часть
//        урона полученного от босса
//        ● Magic должен увеличивать атаку каждого героя после каждого раунда на n-ное
//        количество
//        ● Добавить еще игрока, Thor, удар по боссу имеет шанс оглушить босса на 1 раунд,
//        вследствие чего босс пропускает 1 раунд и не наносит урон героям.