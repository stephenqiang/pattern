package com.tyq.creation.builder;

import com.tyq.creation.builder.config.XMLUtil;

public class ActorController {

    public Actor build(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildHairStyle();
        //通过钩子方法来控制产品的构建
        if (!ab.isBareheaded()) {
            ab.buildHairStyle();
        }

        actor = ab.createActor();
        return actor;
    }

    public static void main(String[] args) {
        ActorBuilder ab;
        ab = (ActorBuilder) XMLUtil.getBean();

        ActorController ac = new ActorController();
        Actor actor;
        actor = ac.build(ab);

        String type = actor.getType();

        System.out.println(type + "的外观：");

        System.out.println("性别：" + actor.getSex());

        System.out.println("面容：" + actor.getFace());

        System.out.println("服装：" + actor.getCostume());

        System.out.println("发型：" + actor.getHairStyle());

    }
}
