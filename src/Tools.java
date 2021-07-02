/**
* @author : psyduck
* @Date : 2021/7/2 9:54
* @Desc :用以计算DPS的工具类 未引入郭
**/
public class Tools {
    /**
     * 普通装备第一条属性总属性池 白帝江关赛季
     */
    static final Integer PROPERTY_POOL = 18855;

    /**
     * @author : psyduck
     * @Date : 2021/7/2 11:49
     * @Param : [baseDamage 基础伤害, damage 攻击力, DamageCoefficient 攻击系数, weaponDamage 武器伤害, weaponDamageCoefficient 武伤系数]
     * @Return : java.lang.Integer
     * @Desc : 通过需要的属性计算出 原始伤害
     */
    static Integer primitiveDamage(Integer baseDamage,Integer damage,Double DamageCoefficient,Double weaponDamage,Double weaponDamageCoefficient){
        Integer result;
        result = (int)Math.floor(baseDamage + (damage * DamageCoefficient) + (weaponDamage * weaponDamageCoefficient));
        return result;
    }


    static Integer benchmarkDamage(Integer primitiveDamage,Double charge,Double MagicOvercome,Double defense){
        Integer result = null;
        return result;
    }


    /**
     * @author : psyduck
     * @Date : 2021/7/2 10:09
     * @Param : [anyNumber]
     * @Return : java.lang.Integer
     * @Desc : 直接郭一下
     */
    @Deprecated
    static Integer magic(Double anyNumber){
        Integer magicNunmber;
        magicNunmber = (int)Math.floor(1024 * anyNumber);
        return magicNunmber;
    }
}
