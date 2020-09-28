package ru.netology.domain;

public class Image {
    private String imageUrl;
    private boolean canDelete;
    private boolean canNewImageSet;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanNewImageSet() {
        return canNewImageSet;
    }

    public void setCanNewImageSet(boolean canNewImageSet) {
        this.canNewImageSet = canNewImageSet;
    }
}
