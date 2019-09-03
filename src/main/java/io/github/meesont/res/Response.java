package io.github.meesont.res;

import com.google.gson.JsonElement;

public class Response {

    private Status status;
    private String msg;
    private JsonElement jsonElement;

    public Response(Status status) {
        this.status = status;
    }

    public Response(Status status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Response(Status status, JsonElement jsonElement) {
        this.status = status;
        this.jsonElement = jsonElement;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonElement getJsonElement() {
        return jsonElement;
    }

    public void setJsonElement(JsonElement jsonElement) {
        this.jsonElement = jsonElement;
    }
}
