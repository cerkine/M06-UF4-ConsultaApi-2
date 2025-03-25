package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UserRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-24T18:55:33.945312570+01:00[Europe/Madrid]", comments = "Generator version: 7.12.0")
public class UserRequest {

    private @Nullable String email;
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @Nullable String avatar;

    public UserRequest email(String email) {
        this.email = email;
        return this;
    }

    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Schema(name = "first_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Schema(name = "last_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserRequest avatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    @Schema(name = "avatar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserRequest {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
