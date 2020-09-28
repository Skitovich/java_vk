package ru.netology.domain;

public class CanDelete {
    private String infoDelete;
    private boolean canDelete;

    public String getInfoDelete() {
        return infoDelete;
    }

    public void setInfoDelete(String infoDelete) {
        this.infoDelete = infoDelete;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }
}
