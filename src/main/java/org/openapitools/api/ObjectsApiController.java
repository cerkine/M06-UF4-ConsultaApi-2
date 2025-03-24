package org.openapitools.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.model.ModelObject;
import org.openapitools.model.ObjectRequest;
import org.openapitools.model.ObjectResponse;
import org.openapitools.model.ObjectsIdDelete200Response;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-24T18:55:33.945312570+01:00[Europe/Madrid]", comments = "Generator version: 7.12.0")
@Controller
@RequestMapping("${openapi.objectManagement.base-path:}")
public class ObjectsApiController implements ObjectsApi {

    private final NativeWebRequest request;
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public ResponseEntity<List<ModelObject>> objectsGet() {
        return ResponseEntity.ok(lista);
    }

    @Override
    public ResponseEntity<ObjectsIdDelete200Response> objectsIdDelete(String id) {
        lista.stream().dropWhile(modelObject -> modelObject.getId().equals(id));
        return ResponseEntity.ok(new ObjectsIdDelete200Response().message("deleted"));
    }

    @Override
    public ResponseEntity<ModelObject> objectsIdGet(String id) {
        Optional<ModelObject> found = lista.stream().filter(modelObject -> modelObject.getId().equals(id)).findFirst();
        if (found.isPresent())
            return ResponseEntity.ok(found.get());
        else return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<ObjectResponse> objectsIdPatch(String id, ObjectRequest body) {
        Optional<ModelObject> found = lista.stream().filter(modelObject -> modelObject.getId().equals(id)).findFirst();
        found.ifPresent(modelObject -> {
            ModelObject change = mapper.convertValue(body, ModelObject.class);
            modelObject.update(change);
        });
        return found.isPresent() ? ResponseEntity.ok(new ObjectResponse().id(found.get().getId())) : ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<ObjectResponse> objectsIdPut(String id, ObjectRequest objectRequest) {
        Optional<ModelObject> found = lista.stream().filter(modelObject -> modelObject.getId().equals(id)).findFirst();
        found.ifPresent(modelObject -> modelObject = mapper.convertValue(objectRequest, ModelObject.class));
        return found.isPresent() ? ResponseEntity.ok(new ObjectResponse().id(found.get().getId())) : ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<ObjectResponse> objectsPost(ObjectRequest objectRequest) {
        lista.add(mapper.convertValue(objectRequest, ModelObject.class).id(UUID.randomUUID().toString()));
        return ResponseEntity.ok(new ObjectResponse().id(lista.getLast().getId()));
    }


    @Autowired
    public ObjectsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
