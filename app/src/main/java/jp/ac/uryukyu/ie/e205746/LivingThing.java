package jp.ac.uryukyu.ie.e205746;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;


public LivingThing(String name, int maximumHP, int attack){
    this.name = name;
    hitPoint = maximumHP;
    this.attack = attack;
    dead = false;
    System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);   
}
    
    public boolean isDead() {
        return this.dead;
    }

    public String getName() {
        return this.name;
    }

    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, getName(), damage);
        wounded(damage);
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
    

