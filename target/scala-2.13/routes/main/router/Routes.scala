// @GENERATOR:play-routes-compiler
// @SOURCE:/home/romanx/Downloads/play-samples-play-scala-forms-example/conf/routes
// @DATE:Tue Nov 17 15:56:48 MSK 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  WidgetController_0: controllers.WidgetController,
  // @LINE:7
  LoginController_1: controllers.LoginController,
  // @LINE:15
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    WidgetController_0: controllers.WidgetController,
    // @LINE:7
    LoginController_1: controllers.LoginController,
    // @LINE:15
    Assets_2: controllers.Assets
  ) = this(errorHandler, WidgetController_0, LoginController_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, WidgetController_0, LoginController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.WidgetController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trylogin""", """controllers.LoginController.good(login:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.listWidgets"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.createWidget"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_WidgetController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_WidgetController_index0_invoker = createInvoker(
    WidgetController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_LoginController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login1_invoker = createInvoker(
    LoginController_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LoginController_good2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trylogin")))
  )
  private[this] lazy val controllers_LoginController_good2_invoker = createInvoker(
    LoginController_1.good(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "good",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """trylogin""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_WidgetController_listWidgets3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private[this] lazy val controllers_WidgetController_listWidgets3_invoker = createInvoker(
    WidgetController_0.listWidgets,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "listWidgets",
      Nil,
      "GET",
      this.prefix + """widgets""",
      """ Widgets""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_WidgetController_createWidget4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private[this] lazy val controllers_WidgetController_createWidget4_invoker = createInvoker(
    WidgetController_0.createWidget,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "createWidget",
      Nil,
      "POST",
      this.prefix + """widgets""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_WidgetController_index0_route(params@_) =>
      call { 
        controllers_WidgetController_index0_invoker.call(WidgetController_0.index)
      }
  
    // @LINE:7
    case controllers_LoginController_login1_route(params@_) =>
      call { 
        controllers_LoginController_login1_invoker.call(LoginController_1.login)
      }
  
    // @LINE:8
    case controllers_LoginController_good2_route(params@_) =>
      call(params.fromQuery[String]("login", None), params.fromQuery[String]("password", None)) { (login, password) =>
        controllers_LoginController_good2_invoker.call(LoginController_1.good(login, password))
      }
  
    // @LINE:11
    case controllers_WidgetController_listWidgets3_route(params@_) =>
      call { 
        controllers_WidgetController_listWidgets3_invoker.call(WidgetController_0.listWidgets)
      }
  
    // @LINE:12
    case controllers_WidgetController_createWidget4_route(params@_) =>
      call { 
        controllers_WidgetController_createWidget4_invoker.call(WidgetController_0.createWidget)
      }
  
    // @LINE:15
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
