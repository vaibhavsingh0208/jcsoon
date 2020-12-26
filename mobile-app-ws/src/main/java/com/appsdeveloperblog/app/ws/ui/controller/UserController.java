package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.appsdeveloperblog.app.ws.service.UserService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDto;
import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public UserRest getUser(@PathVariable String id) {
		UserRest returnVal =  new UserRest();
		UserDto userDto = userService.getUserByUserId(id);
		BeanUtils.copyProperties(userDto, returnVal);
		return returnVal;
	}
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		
		UserRest returnValue =  new UserRest();
		UserDto userDto = new UserDto();
		
		BeanUtils.copyProperties(userDetails, userDto);
		
		UserDto createdUser =  userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		
		return returnValue;
	}
	
	@PutMapping
	public String updateUser() {
		return "update user is called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user is called";
	}

}
