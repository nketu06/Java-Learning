package org.lld.parkinglot.models;

import java.util.Date;

public abstract class BaseModel {
    int id;

    public BaseModel() {}

    public BaseModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    Date createdAt;
}
