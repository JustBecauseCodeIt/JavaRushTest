package com.javarush.test.level13.lesson11.bonus03;

public abstract class AbstractRobot implements Attackable, Defensable {
    String name;

    public String getName()
    {
        return name;
    }

    public BodyPart attack()
    {
        BodyPart attackedBodyPart = null;

        return attackedBodyPart;
    }

    public BodyPart defense()
    {
        BodyPart defencedBodyPart = null;

        return defencedBodyPart;
    }

}
