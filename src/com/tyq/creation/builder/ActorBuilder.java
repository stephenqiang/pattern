package com.tyq.creation.builder;

public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildHairStyle();

    //钩子方法
    public boolean isBareheaded() {
        return false;

    }

    public Actor createActor() {
        return actor;
    }
}
