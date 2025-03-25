package org.openapitools.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.model.User;
import org.openapitools.model.UserRequest;
import org.openapitools.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-24T18:55:33.945312570+01:00[Europe/Madrid]", comments = "Generator version: 7.12.0")
@Controller
@RequestMapping("${openapi.userManagement.base-path:}")
public class UsersApiController implements UsersApi {

    private NativeWebRequest request;
    private final ObjectMapper mapper = new ObjectMapper();
    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User().id(UUID.randomUUID().toString()).email("test@example.com").firstName("John").lastName("Doe").avatar("avatar_url"));
    }

    @Override
    public ResponseEntity<List<UserResponse>> usersGet() {
        return ResponseEntity.ok(users.stream().map(user -> mapper.convertValue(user, UserResponse.class)).toList());
    }

    @Override
    public ResponseEntity<UserResponse> usersIdGet(String id) {
        Optional<User> found = users.stream().filter(user -> user.getId().equals(id)).findFirst();
        return found.map(user -> mapper.convertValue(user, UserResponse.class)).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Void> usersIdDelete(String id) {
        users.removeIf(user -> user.getId().equals(id));
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<UserResponse> usersIdPut(String id, UserRequest userRequest) {
        Optional<User> found = users.stream().filter(user -> user.getId().equals(id)).findFirst();
        found.ifPresent(user -> {
            users.remove(user);
            user = mapper.convertValue(userRequest, User.class);
            users.add(user.id(id));

        });
        return found.isPresent() ? ResponseEntity.ok(new UserResponse().id(id)): ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<UserResponse> usersPost(UserRequest userRequest) {
        users.add(mapper.convertValue(userRequest,User.class).id(UUID.randomUUID().toString()));
        return ResponseEntity.ok(new UserResponse().id(users.getLast().getId()));
    }

    @Autowired
    public UsersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
}
