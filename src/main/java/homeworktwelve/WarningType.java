package homeworktwelve;

public enum WarningType {

    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR");

    private String warningType;

    WarningType(String warningType) {
        this.warningType = warningType;
    }

    public String getWarningType() {
        return warningType;
    }
}
