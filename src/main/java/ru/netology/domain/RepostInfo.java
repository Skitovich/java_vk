package ru.netology.domain;

public class RepostInfo {
    private int countRepost;
    private boolean userRepost;

    public int getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(int countRepost) {
        this.countRepost = countRepost;
    }

    public boolean isUserRepost() {
        return userRepost;
    }

    public void setUserRepost(boolean userRepost) {
        this.userRepost = userRepost;
    }
}
