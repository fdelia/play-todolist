
// @GENERATOR:play-routes-compiler
// @SOURCE:/Applications/MAMP/htdocs/play/todolist/conf/routes
// @DATE:Tue Sep 15 14:54:46 CEST 2015


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
