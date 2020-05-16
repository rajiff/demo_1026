package edu.stackroute.mspatterns.notesservice.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.stackroute.mspatterns.notesservice.notes.Notes;

@RestController
class NotesRESTController {

  @GetMapping("/")
  public Notes findUser(@RequestParam(value = "un", defaultValue = "") String username) {
    return new Notes();
  }

}