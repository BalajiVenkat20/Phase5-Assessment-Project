package com.balaji;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

  @RequestMapping("index")
  public String index() {
    return "index.jsp";
  }
}