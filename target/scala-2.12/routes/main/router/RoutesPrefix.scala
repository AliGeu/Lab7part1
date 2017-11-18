
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/play-java-seed/conf/routes
// @DATE:Fri Nov 17 16:02:51 GMT 2017


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
