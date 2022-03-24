package com.example.app8.model;

public class Node {
    private int id;
    private int pid;
    private String url;
    private String text;

    public Node() {
    }

    public Node(int id, int pid, String url, String text) {
        this.id = id;
        this.pid = pid;
        this.url = url;
        this.text = text;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return this.pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Node id(int id) {
        setId(id);
        return this;
    }

    public Node pid(int pid) {
        setPid(pid);
        return this;
    }

    public Node url(String url) {
        setUrl(url);
        return this;
    }

    public Node text(String text) {
        setText(text);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", pid='" + getPid() + "'" +
            ", url='" + getUrl() + "'" +
            ", text='" + getText() + "'" +
            "}";
    }

}
