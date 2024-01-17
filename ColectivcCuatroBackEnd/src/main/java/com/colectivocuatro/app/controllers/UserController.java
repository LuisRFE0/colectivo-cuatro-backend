package com.colectivocuatro.app.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.colectivocuatro.app.entities.User;
import com.colectivocuatro.app.service.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("{id}")
	User getUser(@PathVariable("id") int id) {
		User user = userService.getUserById(id);
		return user;
	}

	@PostMapping("createUser")
	User createUser(@RequestBody User user) {
		User newUser = userService.createUser(user);
	
	
			return newUser;
	}

	@PutMapping("update/{id}")
	User updateUser(@RequestBody User user, @PathVariable("id") int id) {
		User userUpdate = userService.updateUser(user, id);
		return userUpdate;

	}

//	@PostMapping("login")
//	public Map<String, User> loginAndPassword(@RequestBody Map<String, String> body) {
//		String email = body.get("email");
//		String password = body.get("password");
//
//		User user = userService.findByEmailAndPassword(email, password);
//		
//		
//		Map<String, User> response = new HashMap<>();
//		// Cambiar a booleano
//		
//		
//		if (user == null) {
//			response.put("message", user);
//			return response;
//
//		} else {
//			
//			User userProtected = new User();
//			
//			userProtected.setId_clientes(user.getId_clientes());
//			userProtected.setEmail(user.getEmail());
//			userProtected.setName(user.getName());
//			userProtected.setRole(user.getRole().getName());
//			
//			response.put("message", userProtected);
//			return response;
//		}
//
//	}
	
	


	

}
