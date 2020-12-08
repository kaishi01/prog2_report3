package jp.ac.uryukyu.ie.e205746;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackTest() {
        int defaultEnemyHp = 75;
        Warrior demoWarrior = new Warrior("デモ勇者", 100, 10);
        Enemy slime = new Enemy("スライムもどき", 100, 10);
        demoWarrior.attackWithWeponSkill(slime);
        slime.attack(demoWarrior);
        assertEquals(defaultEnemyHp, slime.getHitPoint());
    }
}