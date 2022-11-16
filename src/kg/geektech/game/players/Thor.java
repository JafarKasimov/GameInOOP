package kg.geektech.game.players;

import kg.geektech.game.general.RPG_GAME;

public class Thor extends Hero {

    public Thor (int health,int damage){
        super(health, damage, SuperAbility.Deafeningbuff);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        RPG_GAME.statusStun = RPG_GAME.random.nextBoolean();

    }
}
//    Добавить в проект каждому классу героя свою уникальную способность
//        ● Berserk должен получать от босса урон, и потом наносить ему свой урон + часть
//        урона полученного от босса
//        ● Magic должен увеличивать атаку каждого героя после каждого раунда на n-ное
//        количество
//        ● Добавить еще игрока, Thor, удар по боссу имеет шанс оглушить босса на 1 раунд,
//        вследствие чего босс пропускает 1 раунд и не наносит урон героям.
