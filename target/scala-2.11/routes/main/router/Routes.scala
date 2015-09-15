
// @GENERATOR:play-routes-compiler
// @SOURCE:/Applications/MAMP/htdocs/play/todolist/conf/routes
// @DATE:Tue Sep 15 14:54:46 CEST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.Application.tasks"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.Application.newTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/$id<[^/]+>/delete""", """controllers.Application.deleteTask(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """$path<.+>""", """controllers.Application.catchAll(path:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_tasks1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_Application_tasks1_invoker = createInvoker(
    Application_1.tasks,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "tasks",
      Nil,
      "GET",
      """ Tasks          """,
      this.prefix + """tasks"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_newTask2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_Application_newTask2_invoker = createInvoker(
    Application_1.newTask,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newTask",
      Nil,
      "POST",
      """""",
      this.prefix + """tasks"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_deleteTask3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Application_deleteTask3_invoker = createInvoker(
    Application_1.deleteTask(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteTask",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """tasks/$id<[^/]+>/delete"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_catchAll5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_catchAll5_invoker = createInvoker(
    Application_1.catchAll(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "catchAll",
      Seq(classOf[String]),
      "GET",
      """ Catch all""",
      this.prefix + """$path<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:9
    case controllers_Application_tasks1_route(params) =>
      call { 
        controllers_Application_tasks1_invoker.call(Application_1.tasks)
      }
  
    // @LINE:10
    case controllers_Application_newTask2_route(params) =>
      call { 
        controllers_Application_newTask2_invoker.call(Application_1.newTask)
      }
  
    // @LINE:11
    case controllers_Application_deleteTask3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deleteTask3_invoker.call(Application_1.deleteTask(id))
      }
  
    // @LINE:14
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_Application_catchAll5_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_catchAll5_invoker.call(Application_1.catchAll(path))
      }
  }
}