package ru.netology.domain;

public class Subscribe {
    private boolean subscribe;
    private String infoSubscribe;

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    public String getInfoSubscribe() {
        return infoSubscribe;
    }

    public void setInfoSubscribe(String infoSubscribe) {
        this.infoSubscribe = infoSubscribe;
    }
}
