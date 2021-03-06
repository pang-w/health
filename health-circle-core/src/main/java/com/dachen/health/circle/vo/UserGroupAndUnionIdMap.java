package com.dachen.health.circle.vo;

import java.io.Serializable;
import java.util.List;

public class UserGroupAndUnionIdMap implements Serializable{

    private Integer userId;
    private List<String> groupIds;
    private List<String> unionIds;

    public UserGroupAndUnionIdMap() {
    }

    public UserGroupAndUnionIdMap(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    public List<String> getUnionIds() {
        return unionIds;
    }

    public void setUnionIds(List<String> unionIds) {
        this.unionIds = unionIds;
    }
}
