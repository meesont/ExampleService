package io.github.meesont.res;

public enum Status {
    SUCCESS("Success"),
    FALIURE("Faliure");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
