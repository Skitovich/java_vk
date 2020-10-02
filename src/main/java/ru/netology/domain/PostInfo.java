package ru.netology.domain;

public class PostInfo {
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean markedAsAdd;
    private String infoFriendsOnly;


    public String getInfoFriendsOnly() {
        return infoFriendsOnly;
    }

    public void setInfoFriendsOnly(String infoFriendsOnly) {
        this.infoFriendsOnly = infoFriendsOnly;
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

    public boolean isMarkedAsAdd() {
        return markedAsAdd;
    }

    public void setMarkedAsAdd(boolean markedAsAdd) {
        this.markedAsAdd = markedAsAdd;
    }
}


