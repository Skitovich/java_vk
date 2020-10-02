package ru.netology.domain;

import java.util.Objects;

public class Post {
    private int id;
    private boolean commentsInfo;
    private String ownerPost;
    private int countLike;
    private int repostInfo;
    private int date;
    private String text;
    private String image;
    private boolean postInfo;
    private String copyright;
    private String geo;
    private int likeInfo;
    private String ownerAvatar;
    private String ownerName;
    private String commentatorInfo;
    private String replyInfo;
    private int commentLikeInfo;
    private String postSource;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isPostInfo() {
        return postInfo;
    }

    public void setPostInfo(boolean postInfo) {
        this.postInfo = postInfo;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
    

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public int getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(int likeInfo) {
        this.likeInfo = likeInfo;
    }

    public String getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(String ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCommentatorInfo() {
        return commentatorInfo;
    }

    public void setCommentatorInfo(String commentatorInfo) {
        this.commentatorInfo = commentatorInfo;
    }

    public String getReplyInfo() {
        return replyInfo;
    }

    public void setReplyInfo(String replyInfo) {
        this.replyInfo = replyInfo;
    }

    public int getCommentLikeInfo() {
        return commentLikeInfo;
    }

    public void setCommentLikeInfo(int commentLikeInfo) {
        this.commentLikeInfo = commentLikeInfo;
    }

    public String getPostSource() {
        return postSource;
    }

    public void setPostSource(String postSource) {
        this.postSource = postSource;
    }
}
