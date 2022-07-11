/*
 * This file is part of WebGoat, an Open Web Application Security Project utility. For details, please see http://www.owasp.org/
 *
 * Copyright (c) 2002 - 2019 Bruce Mayhew
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 *
 * Getting Source ==============
 *
 * Source for this application is maintained at https://github.com/WebGoat/WebGoat, a repository for free software projects.
 */
package org.owasp.webwolf.user;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String registration(@ModelAttribute("userForm") @Valid UserForm userForm, BindingResult bindingResult, HttpServletRequest request) {
        try {
            userValidator.validate(userForm, bindingResult);
            if (bindingResult.hasErrors()) {
                return "registration";
            }
            userService.addUser(userForm.getUsername(), userForm.getPassword());
            request.login(userForm.getUsername(), userForm.getPassword());
            return "redirect:/WebWolf/home";
        } catch (final java.lang.Throwable $ex) {
            throw lombok.Lombok.sneakyThrow($ex);
        }
    }

    public RegistrationController(final UserValidator userValidator, final UserService userService, final AuthenticationManager authenticationManager) {
        this.userValidator = userValidator;
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }
}
