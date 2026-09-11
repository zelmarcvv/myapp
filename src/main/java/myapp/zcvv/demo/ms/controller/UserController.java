package myapp.zcvv.demo.ms.controller;

import myapp.zcvv.demo.ms.model.UserRequest;
import myapp.zcvv.demo.ms.model.UserResponse;
import myapp.zcvv.demo.ms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("v1/retrieve/folio")
    public ResponseEntity<UserResponse> retrieveUser(@RequestBody UserRequest userRequest) {
        UserResponse userResponse = userService.retrieveFolio(userRequest);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }
}
