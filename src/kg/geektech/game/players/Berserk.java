package kg.geektech.game.players;

import kg.geektech.game.general.RPG_GAME;

public class Berserk extends Hero {


    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int saveDamageAndRevert = boss.getDamage() / 4;
        boss.setHealth(boss.getHealth() - saveDamageAndRevert);
        System.out.println("Berserk поглотил: (" +
                saveDamageAndRevert + ") урона и нанес урона " + this.getDamage());

    }

}
//    Добавить в проект каждому классу героя свою уникальную способность
//        ● Berserk должен получать от босса урон, и потом наносить ему свой урон + часть
//        урона полученного от босса
//        ● Magic должен увеличивать атаку каждого героя после каждого раунда на n-ное
//        количество
//        ● Добавить еще игрока, Thor, удар по боссу имеет шанс оглушить босса на 1 раунд,
//        вследствие чего босс пропускает 1 раунд и не наносит урон героям.
