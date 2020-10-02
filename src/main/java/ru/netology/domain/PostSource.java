package ru.netology.domain;

public class PostSource {


    private String postType;
    private String typeSource;
    private String platform;

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getTypeSource() {
        return typeSource;
    }

    public void setTypeSource(String typeSource) {
        this.typeSource = typeSource;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUrlSource() {
        return urlSource;
    }

    public void setUrlSource(String urlSource) {
        this.urlSource = urlSource;
    }

    private String urlSource;

}

