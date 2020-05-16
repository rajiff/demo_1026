package edu.stackroute.mspatterns.userservice.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.stackroute.mspatterns.userservice.users.User;

@RestController
class UsersRESTController {

  @GetMapping("/")
  public User findUser(@RequestParam(value = "un", defaultValue = "") String username) {
    return new User();
  }

}