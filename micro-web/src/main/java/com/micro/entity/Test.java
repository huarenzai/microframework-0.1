package com.micro.entity;

import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Test implements Serializable {
    private int id;
    private String name;
    private String nodeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

}
