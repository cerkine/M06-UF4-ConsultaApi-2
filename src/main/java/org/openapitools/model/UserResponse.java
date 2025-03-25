package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * UserResponse
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-24T18:55:33.945312570+01:00[Europe/Madrid]", comments = "Generator version: 7.12.0")
public class UserResponse {

    private @Nullable String id;
    private @Nullable String email;
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @Nullable String avatar;

    public UserResponse id(String id) {
        this.id = id;
        return this;
    }

    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserResponse email(String email) {
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

    public UserResponse firstName(String firstName) {
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

    public UserResponse lastName(String lastName) {
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

    public UserResponse avatar(String avatar) {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserResponse userResponse = (UserResponse) o;
        return Objects.equals(this.id, userResponse.id) &&
                Objects.equals(this.email, userResponse.email) &&
                Objects.equals(this.firstName, userResponse.firstName) &&
                Objects.equals(this.lastName, userResponse.lastName) &&
                Objects.equals(this.avatar, userResponse.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, lastName, avatar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
