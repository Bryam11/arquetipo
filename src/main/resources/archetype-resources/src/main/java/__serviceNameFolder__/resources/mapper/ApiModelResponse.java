package ${package}.${serviceNameFolder.replace('/','.')}.resources.mapper;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ApiModelResponse(String code, String message, String description, Object data) {
    public ApiModelResponse(String code, String message, String description, Object data) {
        this.code = code;
        this.message = message;
        this.description = description;
        this.data = data;
    }

    public String code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public String description() {
        return this.description;
    }

    public Object data() {
        return this.data;
    }
}
