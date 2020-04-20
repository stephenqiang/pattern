package com.tyq.creation.prototype.deepclone;

import java.io.Serializable;

public class Attachment implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void download() {
        System.out.println("下载附件，文件名为：" + name);
    }
}
