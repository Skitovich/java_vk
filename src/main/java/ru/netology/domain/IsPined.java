package ru.netology.domain;

public class IsPined {
    private String infoIsPined;

    public String getInfoIsPined() {
        return infoIsPined;
    }

    public void setInfoIsPined(String infoIsPined) {
        this.infoIsPined = infoIsPined;
    }

    public static class CanEdit {
        private String infoEdit;
        private boolean canEdit;

        public String getInfoEdit() {
            return infoEdit;
        }

        public void setInfoEdit(String infoEdit) {
            this.infoEdit = infoEdit;
        }

        public boolean isCanEdit() {
            return canEdit;
        }

        public void setCanEdit(boolean canEdit) {
            this.canEdit = canEdit;
        }
    }
}
