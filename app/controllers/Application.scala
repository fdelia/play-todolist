package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

// New
import play.api.i18n.{ MessagesApi, I18nSupport }
import javax.inject._

import models.Task

// New: Inject other components as dependencies
class Application @Inject() (val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def index = Action {
    Redirect(routes.Application.tasks)
  }

  def tasks = Action {
    Ok(views.html.index(Task.all(), taskForm))
  }

  // request is to fill the form, bindFromRequest uses the request data
  def newTask = Action { implicit request =>
    taskForm.bindFromRequest.fold(
      errors => BadRequest(views.html.index(Task.all(), errors)),
      label => {
        Task.create(label)
        Redirect(routes.Application.tasks)
      })
  }

  def deleteTask(id: Long) = Action { implicit request =>
    // Debug like this
    // Logger.debug(id.toString)
    Task.delete(id)
    Redirect(routes.Application.tasks)
  }

  val taskForm = Form(
    "label" -> nonEmptyText)

  // Redirect not specified paths to index
  def catchAll(path: String) = Action {
    Redirect(routes.Application.index)
  }
}
