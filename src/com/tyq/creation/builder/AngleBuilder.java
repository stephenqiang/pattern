package com.tyq.creation.builder;

public class AngleBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("披肩长发");
    }

    //覆盖钩子方法

    public boolean isBareheaded() {

        return true;

    }
}
