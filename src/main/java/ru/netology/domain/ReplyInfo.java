package ru.netology.domain;

public class ReplyInfo {
    private boolean canReply;
    private String showNextComments;

    public boolean isCanReply() {
        return canReply;
    }

    public void setCanReply(boolean canReply) {
        this.canReply = canReply;
    }

    public String getShowNextComments() {
        return showNextComments;
    }

    public void setShowNextComments(String showNextComments) {
        this.showNextComments = showNextComments;
    }
}
