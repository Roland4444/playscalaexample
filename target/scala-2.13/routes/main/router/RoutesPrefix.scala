// @GENERATOR:play-routes-compiler
// @SOURCE:/home/romanx/Downloads/play-samples-play-scala-forms-example/conf/routes
// @DATE:Wed Nov 18 10:46:04 MSK 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
