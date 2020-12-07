package jp.ac.uryukyu.ie.e205746;


/**
 * ヒーロークラス。 String name; //敵の名前 int hitPoint; //敵のHP int attack; //敵の攻撃力 boolean
 * dead; //敵の生死状態。true=死亡。 Created by tnal on 2016/11/13.
 */


class Hero extends LivingThing{
    super(name, hitPoint, attack);
    //private String name;
    //private int hitPoint;
    //private int attack;
    //private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      ヒーロー名
     * 
     * @param maximumHP ヒーローのHP
     * 
     * @param attack    ヒーローの攻撃力
     */

    public Hero(String name, int maximumHP, int attack) {
        super(name, hitPoint, attack);
        //this.name = name;
        //hitPoint = maximumHP;
        //this.attack = attack;
        //dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。 attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * 
     * @param e 攻撃対象
     */

    public void attack(Enemy e) {
        int damage = (int) (Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */

    public void wounded(int damage) {
        hitPoint -= damage; // hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    /**
     * カプセル化されたヒーロー名を参照するためのメソッド。
     * 
     * @return this.name ヒーロー名
     */

    public String getName() {
        return this.name;
    }

    /**
     * カプセル化されたヒーローのHPを参照するためのメソッド。
     * 
     * @return this.hitPoint ヒーローのHP
     */

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

    public boolean getDead() {
        return this.dead;
    }
}
