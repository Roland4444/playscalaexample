
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

object good extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h4>Its work!  """),_display_(/*8.17*/login),format.raw/*8.22*/("""  """),format.raw/*8.24*/("""<br>  """),_display_(/*8.31*/password),format.raw/*8.39*/("""</h4>
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
                  DATE: 2020-11-17T16:06:45.896
                  SOURCE: /home/romanx/Downloads/play-samples-play-scala-forms-example/app/views/good.scala.html
                  HASH: b25c3cb99a40abfbc5b261a47a7aa6e5e0fe454b
                  MATRIX: 810->0|959->123|984->128|1013->130|1046->137|1074->145
                  LINES: 26->1|33->8|33->8|33->8|33->8|33->8
                  -- GENERATED --
              */
          