package com.ralien.erp_system.authn.api;

import com.ralien.erp_system.authn.dto.person.CreatePersonRequest;
import com.ralien.erp_system.authn.dto.person.PlainPerson;
import com.ralien.erp_system.authn.dto.person.UpdatePersonRequest;
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
@RequestMapping("persons")
public class PersonResource {
    @Autowired
    private PersonService personService;

    @GetMapping("{personId}")
    public ResponseEntity<PlainPerson> get(@PathVariable @NotBlank UUID personId) {
        return ResponseEntity.ok(personService.get(personId));
    }

    @PostMapping
    public ResponseEntity<PlainPerson> addNew(@Valid @RequestBody CreatePersonRequest request) throws URISyntaxException {
        return ResponseEntity.created(new URI("")).body(personService.create(request));
    }

    @PutMapping
    public PlainPerson update(@Valid @RequestBody UpdatePersonRequest request) {
        return null;
    }

    @PutMapping("{personId}/deactivate")
    public ResponseEntity<String> deactivate(@NotNull @NotEmpty @PathVariable UUID personId) {
        personService.deactivate(personId);
        return ResponseEntity.ok("marked deactivated");
    }

    @PutMapping("{personId}/activate")
    public ResponseEntity<String> activate(@NotNull @NotEmpty @PathVariable UUID personId) {
        personService.activate(personId);
        return ResponseEntity.ok("marked activated");
    }
}
