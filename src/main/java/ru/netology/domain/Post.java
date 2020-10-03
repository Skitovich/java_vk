package ru.netology.domain;

public class Post {
    private int id;
    private CommentInfo commentsInfo;
    private String ownerPost;
    private CountLikes countLike;
    private RepostInfo repostInfo;
    private int date;
    private String text;
    private String image;
    private PostInfo postInfo;
    private String copyright;
    private String geo;
    private int likeInfo;
    private String ownerAvatar;
    private String ownerName;
    private CommentatorInfo commentatorInfo;
    private ReplyInfo replyInfo;
    private String postSource;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CommentInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getOwnerPost() {
        return ownerPost;
    }

    public void setOwnerPost(String ownerPost) {
        this.ownerPost = ownerPost;
    }

    public CountLikes getCountLike() {
        return countLike;
    }

    public void setCountLike(CountLikes countLike) {
        this.countLike = countLike;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {
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

    public PostInfo getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(PostInfo postInfo) {
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

    public CommentatorInfo getCommentatorInfo() {
        return commentatorInfo;
    }

    public void setCommentatorInfo(CommentatorInfo commentatorInfo) {
        this.commentatorInfo = commentatorInfo;
    }

    public ReplyInfo getReplyInfo() {
        return replyInfo;
    }

    public void setReplyInfo(ReplyInfo replyInfo) {
        this.replyInfo = replyInfo;
    }

    public String getPostSource() {
        return postSource;
    }

    public void setPostSource(String postSource) {
        this.postSource = postSource;
    }


}
