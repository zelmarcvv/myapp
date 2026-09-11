package myapp.zcvv.demo.ms.service.impl;

import lombok.extern.slf4j.Slf4j;
import myapp.zcvv.demo.ms.document.User;
import myapp.zcvv.demo.ms.model.UserRequest;
import myapp.zcvv.demo.ms.model.UserResponse;
import myapp.zcvv.demo.ms.repository.UserRepository;
import myapp.zcvv.demo.ms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse retrieveFolio(UserRequest userRequest) {
        log.info("request: " + userRequest.getFolio());
        User user = userRepository.findNameByUser(userRequest.getFolio());
        log.info("user: " + user);
        UserResponse userResponse = new UserResponse(user.getFolio(),user.getUser());
        return userResponse;
    }
}
