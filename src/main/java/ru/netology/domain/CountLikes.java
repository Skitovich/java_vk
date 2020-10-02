package ru.netology.domain;

public class CountLikes {
    private int countLikes;
    private boolean canLike;
    private boolean userLike;
    private boolean canPublish;

    public int getCountLikes() {
        return countLikes;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }
}
