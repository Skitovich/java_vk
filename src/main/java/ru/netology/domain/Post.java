package ru.netology.domain;

public class Post {
    private int Id;
    private boolean commentsInfo;
    private String ownerPost;
    private int viewInfo;
    private int countLike;
    private int repostInfo;
    private int date;
    private String text;
    private String image;
    private boolean subscribe;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public boolean isCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(boolean commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getOwnerPost() {
        return ownerPost;
    }

    public void setOwnerPost(String ownerPost) {
        this.ownerPost = ownerPost;
    }

    public int getViewInfo() {
        return viewInfo;
    }

    public void setViewInfo(int viewInfo) {
        this.viewInfo = viewInfo;
    }

    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }

    public int getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(int repostInfo) {
        this.repostInfo = repostInfo;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }






}
