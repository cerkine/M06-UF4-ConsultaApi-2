package org.openapitools.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.openapitools.model.User;
import org.openapitools.model.UserRequest;
import org.openapitools.model.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-24T18:55:33.945312570+01:00[Europe/Madrid]", comments = "Generator version: 7.12.0")
@Validated
@Tag(name = "users", description = "The Users API")
public interface UsersApi {

    List<User> users = new ArrayList<>();

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Operation(
            operationId = "usersGet",
            summary = "List all users",
            description = "Returns a list of all users",
            responses = {
                    @ApiResponse(responseCode = "200", description = "A JSON array of users", content = {
                            @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserResponse.class)))
                    })
            }
    )
    @GetMapping(value = "/users", produces = { "application/json" })
    default ResponseEntity<List<UserResponse>> usersGet() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "usersIdGet",
            summary = "Get a single user",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The requested user", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponse.class))
                    })
            }
    )
    @GetMapping(value = "/users/{id}", produces = { "application/json" })
    default ResponseEntity<UserResponse> usersIdGet(
            @Parameter(name = "id", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "usersPost",
            summary = "Create a new user",
            responses = {
                    @ApiResponse(responseCode = "201", description = "User successfully created", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponse.class))
                    })
            }
    )
    @PostMapping(value = "/users", produces = { "application/json" }, consumes = { "application/json" })
    default ResponseEntity<UserResponse> usersPost(
            @Parameter(name = "User", required = true) @Valid @RequestBody UserRequest user
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "usersIdPut",
            summary = "Update an existing user",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Updated user", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
                    })
            }
    )
    @PutMapping(value = "/users/{id}", produces = { "application/json" }, consumes = { "application/json" })
    default ResponseEntity<UserResponse> usersIdPut(
            @Parameter(name = "id", required = true, in = ParameterIn.PATH) @PathVariable("id") String id,
            @Parameter(name = "User", required = true) @Valid @RequestBody UserRequest user
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "usersIdDelete",
            summary = "Delete a user",
            responses = {
                    @ApiResponse(responseCode = "200", description = "User deleted successfully")
            }
    )
    @DeleteMapping(value = "/users/{id}", produces = { "application/json" })
    default ResponseEntity<Void> usersIdDelete(
            @Parameter(name = "id", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
