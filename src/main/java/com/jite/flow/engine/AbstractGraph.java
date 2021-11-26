package com.jite.flow.engine;

/**
 * @author Lux Sun
 * @date 2021/10/18
 */
public abstract class AbstractGraph {

    protected String id;

    protected Boolean async;

    protected String name;

    protected abstract String getJobNodeName();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getAsync() {
        return async;
    }

    public void setAsync(Boolean async) {
        this.async = async;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
