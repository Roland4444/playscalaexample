
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <style>
      #loginform """),format.raw/*8.18*/("""{"""),format.raw/*8.19*/("""
        """),format.raw/*9.9*/("""text-align: center;



      """),format.raw/*13.7*/("""}"""),format.raw/*13.8*/("""
    """),format.raw/*14.5*/("""</style>
    <div id="loginform" class="logindiv">



        <form action="/trylogin">
            <h1>Логин</h1>
            <h5>Login</h5><input name="login"> </input><br>
            <h5>Password</h5><input name="password" id="password"> </input><br>
            <button type="submit">Enter</button>
        </form>
    </div>

</head>
<body>

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-17T15:53:41.220
                  SOURCE: /home/romanx/Downloads/play-samples-play-scala-forms-example/app/views/login.scala.html
                  HASH: 801d9a0f0d0054a56f5e1a208cda1036205414c9
                  MATRIX: 811->0|960->122|988->123|1023->132|1079->161|1107->162|1139->167
                  LINES: 26->1|33->8|33->8|34->9|38->13|38->13|39->14
                  -- GENERATED --
              */
          