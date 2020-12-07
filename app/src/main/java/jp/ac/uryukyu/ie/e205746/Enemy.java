package jp.ac.uryukyu.ie.e205746;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */



class Enemy extends LivingThing{
    Enemy(){
        super(name, hitPont, attack);
    }
    //private String name;
    //private int hitPoint;
    //private int attack;
    //private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    
    @Override
    public boolean isDead(){
        return this.dead;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void attack(LivingThing opponent){
        if( hitPoint > 0) {
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
            opponent.wounded(damage);
        }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
    /*
    public Enemy (String name, int maximumHP, int attack) {
        //this.name = name;
        //hitPoint = maximumHP;
        //this.attack = attack;
        //dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    /*
    public void attack(Hero hero){
        if( hitPoint > 0) {
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
            hero.wounded(damage);
        }
        else{
        }
        //int damage = (int)(Math.random() * attack);
        //System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.name, damage);
        //hero.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    /*
    public void wounded(int damage){
        hitPoint -= damage;
        //hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
            }
    }
    /**
     * カプセル化された敵の名前を参照するためのメソッド。
     * @return this.name 敵の名前
     */
    /*
    public String getName() {
        return this.name;
    }
    /**
     * カプセル化された敵のHPを参照するためのメソッド。
     * @return this.hitPoint 敵のHP
     */
    /*
    public int getHitPoint(){
        return this.hitPoint;
    }
    /**
     * カプセル化された敵の攻撃力を参照するためのメソッド。
     * @return this.attack 敵の攻撃力
     */
    /*
    public int getAttack(){
        return this.attack;
    }
    /**
     * カプセル化された敵の生死状態を参照するためのメソッド。
     * @return this.dead 敵の生死状態。true=死亡。
     */
    /*
    public boolean getDead(){
        return this.dead;
    }
}
