package controllers
import com.fasterxml.jackson.databind.JsonNode
import javax.inject.Inject
import play.api.libs.json.JsPath.\
import play.api.mvc._

import scala.xml.NodeSeq.Empty.\
class LoginController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc){
  def login = Action {
    Ok(views.html.login())
  }

  def good(login: String, password: String) = Action {implicit request =>
    println(login)
    println(password)
    Ok(views.html.good())

  }

  def test() = Action {
    val age=22
    Ok(views.html.test(age))
  }

}
/////https://askdev.ru/q/poluchit-stroku-tela-zaprosa-otpravlennuyu-v-post-request-v-play-framework-java-340221/