package org.owasp.webgoat.users;

import lombok.SneakyThrows;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @author nbaars
 * @since 3/19/17.
 */
@Controller
public class RegistrationController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(RegistrationController.class);
    private UserValidator userValidator;
    private UserService userService;
    private AuthenticationManager authenticationManager;

    @GetMapping("/registration")
    public String showForm(UserForm userForm) {
        return "registration";
    }

    @PostMapping("/register.mvc")
    public String registration(@ModelAttribute("userForm") @Valid UserForm userForm, BindingResult bindingResult, HttpServletRequest request) throws ServletException {
        userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.addUser(userForm.getUsername(), userForm.getPassword());
        request.login(userForm.getUsername(), userForm.getPassword());
        return "redirect:/attack";
    }

    public RegistrationController(final UserValidator userValidator, final UserService userService, final AuthenticationManager authenticationManager) {
        this.userValidator = userValidator;
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }
}
