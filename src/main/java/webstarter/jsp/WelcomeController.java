/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package webstarter.jsp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import webstarter.service.UserService;

/**
 * Simple Web/JSP controller. Maps to root context ( "/" ) and
 * returns a String that represents the name of the .jsp file
 * to look for. Gets the view's model (not to be confused with 
 * the application's model, which is in domain), and puts any
 * value the .jsp pages need in it.
 *   
 * @author karl
 *
 */
@Controller
@RequestMapping("/")
public class WelcomeController {

	@Autowired
	private UserService userService;

	@RequestMapping(method=RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
		model.put("users", userService.findAll() );
		return "welcome";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String createUser(@RequestParam String name, Map<String, Object> model) {
		userService.createUser(name);
		model.put("users", userService.findAll() );
		return "welcome";
	}

}