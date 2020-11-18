package controllers
import java.io.FileWriter
import java.sql.{Connection, ResultSet, Statement}

import anorm.{Row, SQL, SimpleSql, SqlParser, SqlStringInterpolation}
import anorm.SqlParser.scalar
import com.fasterxml.jackson.databind.JsonNode
import javax.inject.Inject
import play.api.libs.json.JsPath.\
import play.api.mvc._
import ch.roland.SBTPack
import play.api.db

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

  def app() = Action {
    print("fuck")


    val q: SimpleSql[Row] = SQL"SELECT * FROM simple.simple"
    val number: Int = q.as(SqlParser.scalar[Int].single)

    println("PARSED::=>"+number)

    val Str: String = new SBTPack().description
    Ok(views.html.app(Str))
  }

}
/////https://askdev.ru/q/poluchit-stroku-tela-zaprosa-otpravlennuyu-v-post-request-v-play-framework-java-340221/


