package myapp.zcvv.demo.ms.service;

import myapp.zcvv.demo.ms.model.UserRequest;
import myapp.zcvv.demo.ms.model.UserResponse;

public interface UserService {

    UserResponse retrieveFolio(UserRequest userRequest);
}
