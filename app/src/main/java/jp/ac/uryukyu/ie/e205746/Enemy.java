package jp.ac.uryukyu.ie.e205746;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */



public class Enemy extends LivingThing{
    
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */

    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    
    /*
    public void attack(LivingThing opponent){
        setHitPoint(getHitPoint() - damage);
        if( setHitPoint() > 0) {
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    */
    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
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
    
    /**
     * カプセル化された敵のHPを参照するためのメソッド。
     * @return this.hitPoint 敵のHP
     */
    
    /**
     * カプセル化された敵の攻撃力を参照するためのメソッド。
     * @return this.attack 敵の攻撃力
     */
    /*
    }
    /**
     * カプセル化された敵の生死状態を参照するためのメソッド。
     * @return this.dead 敵の生死状態。true=死亡。
     */
    
}
