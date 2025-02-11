package app.controller;

import app.service.UserServiceSimpleImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import app.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller()
public class UsersController {

    @GetMapping(value = "/users")
    public String showAll(ModelMap model, @RequestParam
            (required = false, defaultValue = "5") int count) {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Toyota", "Red"));
        users.add(new User(2, "Nissan", "Blue"));
        users.add(new User(3, "Jeep", "Green"));
        users.add(new User(4, "BMW", "Yellow"));
        users.add(new User(5, "Lada", "Pink"));

        UserServiceSimpleImpl userService = new UserServiceSimpleImpl(users);

        model.addAttribute("users", userService.getUsers(count));

        return "users";
    }

}
