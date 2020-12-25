package com.ralien.erp_system.authn.api;

import com.ralien.erp_system.authn.models.CreateUserRequest;
import com.ralien.erp_system.authn.models.PlainUser;
import com.ralien.erp_system.authn.models.UpdateUserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.PathParam;

@Controller
@RequestMapping("users")
public class UserResource {
    @GetMapping("id")
    public PlainUser get(@PathParam("id") String id) {
        return null;
    }

    @PostMapping
    public PlainUser create(@Valid @RequestBody CreateUserRequest request) {
        return null;
    }

    @PutMapping
    public PlainUser update(@Valid @RequestBody UpdateUserRequest request) {
        return null;
    }

    @DeleteMapping("id")
    public String deactivate(@NotBlank @PathParam("id") String userId) {
        return null;
    }
}
