package controllers

import play.api.mvc._

class HelloWorld extends Controller{

  def sayHello = Action {
    Ok("hello world")
  }

}
