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
        return dead;
    }

    public String getName() {
        return name;
    }

    public void attack(LivingThing opponent) {
        if (dead){
            return;
        }
        int damage = (int) (Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
        opponent.wounded(damage);
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public int getHitPoint() {
        return this.hitPoint;
    }

    /**
     * カプセル化されたヒーローの攻撃力を参照するためのメソッド。
     * 
     * @return this.attack ヒーローの攻撃力
     */

    public int getAttack() {
        return this.attack;
    }

    /**
     * カプセル化されたヒーローの生死状態を参照するためのメソッド。
     * 
     * @return this.dead ヒーローの生死状態。true=死亡。
     */

    //public boolean getDead() {
        //return this.dead;
    //}

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public void setName(String name){
        this.name = name;
    }
}
    

