package common.enums;

/**
* @author : psyduck
* @Date : 2021/7/2 10:23
* @Desc : 110级 属性系数枚举
**/
public enum PropertyCoefficientEnum {

    会心("会心",35737.5),
    会心效果("会心效果",12506.25),
    御劲("御劲",35737.5),
    化劲("化劲",5175.0),
    命中("命中",25991.25),
    闪避("闪避",17355.0),
    招架("招架",16293.75),
    无双("无双",34458.75),
    外防("外防",19091.25),
    内防("内防",19091.25),
    破防("破防",35737.5),
    急速("急速",43856.25);

    //属性名
    public final String propertyName;
    //系数值
    public final Double coefficient;

    PropertyCoefficientEnum(String propertyName, Double coefficient) {
        this.propertyName = propertyName;
        this.coefficient = coefficient;
    }
}
