package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Objects;

/**
 * User
 */
@JsonTypeName("User")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-24T18:55:33.945312570+01:00[Europe/Madrid]", comments = "Generator version: 7.12.0")
public class User {

    private @Nullable String id;
    private @Nullable String email;
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @Nullable String avatar;

    public User id(String id) {
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

    public User email(String email) {
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

    public User firstName(String firstName) {
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

    public User lastName(String lastName) {
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

    public User avatar(String avatar) {
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
        User user = (User) o;
        return Objects.equals(this.id, user.id) &&
                Objects.equals(this.email, user.email) &&
                Objects.equals(this.firstName, user.firstName) &&
                Objects.equals(this.lastName, user.lastName) &&
                Objects.equals(this.avatar, user.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, lastName, avatar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");
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