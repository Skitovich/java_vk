package ru.netology.domain;

public class FriendsOnly {
    private String infoFriendsOnly;

    public String getInfoFriendsOnly() {
        return infoFriendsOnly;
    }

    public void setInfoFriendsOnly(String infoFriendsOnly) {
        this.infoFriendsOnly = infoFriendsOnly;
    }

    public static class CanDelete {
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
}
