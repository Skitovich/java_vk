package ru.netology.domain;

public class CommentInfo {
    private boolean canComment;
    private boolean canEdit;
    private int likeInfo;
    private boolean canCloseComments;
    private boolean canOpenComments;
    private boolean userLike;
    public String CommentLikeInfo;
    private int commentLikeSummary;

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public int getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(int likeInfo) {
        this.likeInfo = likeInfo;
    }

    public boolean isCanCloseComments() {
        return canCloseComments;
    }

    public void setCanCloseComments(boolean canCloseComments) {
        this.canCloseComments = canCloseComments;
    }

    public boolean isCanOpenComments() {
        return canOpenComments;
    }

    public void setCanOpenComments(boolean canOpenComments) {
        this.canOpenComments = canOpenComments;
    }

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }

    public String getCommentLikeInfo() {
        return CommentLikeInfo;
    }

    public void setCommentLikeInfo(String commentLikeInfo) {
        CommentLikeInfo = commentLikeInfo;
    }

    public int getCommentLikeSummary() {
        return commentLikeSummary;
    }

    public void setCommentLikeSummary(int commentLikeSummary) {
        this.commentLikeSummary = commentLikeSummary;
    }
}
