package io.fdlessard.codebites.oauth2.sso;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/home")
  public String home(Principal principal) {
    String name = principal.getName();
    return "Made it to protected api on resource server! " + name;
  }
}
