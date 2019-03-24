package com.example.microservices;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("api/user")
public class UserAPI {

  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  String list() {
      return "Listing User\n";
  }

  @RequestMapping(method = RequestMethod.POST)
  @ResponseBody
  String add() {
      return "User Added\n";
  }

  @RequestMapping(method = RequestMethod.PUT)
  @ResponseBody
  String update() {
      return "User Updated\n";
  }

  @RequestMapping(method = RequestMethod.DELETE)
  @ResponseBody
  String delete() {
      return "User Deleted\n";
  }

}
