package ru.netology.domain;

public class Date {
    private int publicationTime;
    private boolean showPublicationTime;

    public int getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(int publicationTime) {
        this.publicationTime = publicationTime;
    }

    public boolean isShowPublicationTime() {
        return showPublicationTime;
    }

    public void setShowPublicationTime(boolean showPublicationTime) {
        this.showPublicationTime = showPublicationTime;
    }
}
