package com.ralien.erp_system.user.api;

import com.ralien.erp_system.user.dto.person.CreatePersonRequest;
import com.ralien.erp_system.user.dto.person.PlainPerson;
import com.ralien.erp_system.user.dto.person.UpdatePersonRequest;
import com.ralien.erp_system.user.services.IPersonService;
import com.ralien.erp_system.user.services.impl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequestMapping("persons")
public class PersonResource {

    @Autowired
    private IPersonService personService;

    @GetMapping("{personId}")
    public ResponseEntity<PlainPerson> get(@PathVariable @NotBlank UUID personId) {
        return ResponseEntity.ok(personService.get(personId));
    }

    @PostMapping
    public ResponseEntity<Object> addNew(@Valid @RequestBody CreatePersonRequest request) {
        return new ResponseEntity<>(personService.create(request), HttpStatus.CREATED);
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
