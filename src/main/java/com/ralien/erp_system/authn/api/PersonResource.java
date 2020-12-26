package com.ralien.erp_system.authn.api;

import com.ralien.erp_system.authn.dto.person.CreateUserRequest;
import com.ralien.erp_system.authn.dto.person.PlainUser;
import com.ralien.erp_system.authn.dto.person.UpdateUserRequest;
import com.ralien.erp_system.authn.services.impl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

@Controller
@RequestMapping("users")
public class PersonResource {
    @Autowired
    private PersonService personService;

    @GetMapping("{userId}")
    public ResponseEntity<PlainUser> get(@PathVariable @NotBlank UUID userId) {
        return ResponseEntity.ok(personService.get(userId));
    }

    @PostMapping
    public ResponseEntity<PlainUser> addNew(@Valid @RequestBody CreateUserRequest request) throws URISyntaxException {
        return ResponseEntity.created(new URI("")).body(personService.create(request));
    }

    @PutMapping
    public PlainUser update(@Valid @RequestBody UpdateUserRequest request) {
        return null;
    }

    @PutMapping("{userId}/deactivate")
    public ResponseEntity<String> deactivate(@NotNull @NotEmpty @PathVariable UUID userId) {
        personService.deactivate(userId);
        return ResponseEntity.ok("marked deactivated");
    }

    @PutMapping("{userId}/activate")
    public ResponseEntity<String> activate(@NotNull @NotEmpty @PathVariable UUID userId) {
        personService.activate(userId);
        return ResponseEntity.ok("marked activated");
    }
}
