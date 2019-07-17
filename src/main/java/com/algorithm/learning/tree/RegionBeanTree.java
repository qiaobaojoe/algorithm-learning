package com.algorithm.learning.tree;

import java.util.List;

public class RegionBeanTree {
    private String code;
    private String label;
    private String pid;
    private List<RegionBeanTree> children;

    @Override
    public String toString() {
        return "RegionBeanTree{" +
                "code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", pid='" + pid + '\'' +
                ", child=" + children +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List<RegionBeanTree> getChildren() {
        return children;
    }

    public void setChildren(List<RegionBeanTree> child) {
        this.children = child;
    }
}
