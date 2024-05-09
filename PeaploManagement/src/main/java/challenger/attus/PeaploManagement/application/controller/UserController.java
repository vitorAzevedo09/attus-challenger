package challenger.attus.PeaploManagement.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import challenger.attus.PeaploManagement.domain.entities.User;
import challenger.attus.PeaploManagement.domain.service.UserService;

import java.util.List;

/**
 * UserController
 */
@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping
  public ResponseEntity<?> createUser(@RequestBody final User user) {
    try {
      User createdUser = userService.create(user);
      return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<?> getUser(@PathVariable final Long id) {
    try {
      User user = userService.findOrFail(id);
      return ResponseEntity.ok(user);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
    }
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<?> updateUser(@PathVariable final Long id, @RequestBody final User user) {
    try {
      User updatedUser = userService.update(id, user);
      return ResponseEntity.ok(updatedUser);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
    }
  }

}
