
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/play-java-seed/conf/routes
// @DATE:Sun Nov 19 10:18:59 GMT 2017


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
