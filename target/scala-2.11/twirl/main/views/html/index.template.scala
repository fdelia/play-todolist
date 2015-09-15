
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Task],Form[String],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks: List[Task], taskForm: Form[String])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
    
    """),format.raw/*7.5*/("""<div class="page-header">
        <h1>"""),_display_(/*8.14*/tasks/*8.19*/.size),format.raw/*8.24*/(""" """),format.raw/*8.25*/("""task(s)</h1>
    </div>
    
    <div class="panel panel-default">
        <div class="panel-heading">
            Tasks
        </div>
        <ul class="list-group">
            """),_display_(/*16.14*/tasks/*16.19*/.map/*16.23*/ { task =>_display_(Seq[Any](format.raw/*16.33*/("""
                """),format.raw/*17.17*/("""<li class="list-group-item">
                    """),_display_(/*18.22*/task/*18.26*/.label),format.raw/*18.32*/("""
                    
                    """),_display_(/*20.22*/form(routes.Application.deleteTask(task.id))/*20.66*/ {_display_(Seq[Any](format.raw/*20.68*/("""
                        """),format.raw/*21.25*/("""<input type="submit" value="Delete" class="btn btn-default">
                    """)))}),format.raw/*22.22*/("""
                """),format.raw/*23.17*/("""</li>
            """)))}),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</ul>
    </div>
    
    <div class="panel panel-default">
        <div class="panel-heading">
            Add a new task
        </div>
        <div class="panel-body">
    
            """),_display_(/*34.14*/form(routes.Application.newTask)/*34.46*/ {_display_(Seq[Any](format.raw/*34.48*/("""
                """),format.raw/*35.17*/("""<div class="input-group">
                    """),_display_(/*36.22*/inputText(taskForm("label"))),format.raw/*36.50*/("""
                    
                    """),format.raw/*38.21*/("""<input type="submit" value="Create" class="btn btn-primary">
                </div>
            """)))}),format.raw/*40.14*/("""
        """),format.raw/*41.9*/("""</div>
    </div>
    
""")))}))
      }
    }
  }

  def render(tasks:List[Task],taskForm:Form[String],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(tasks,taskForm)(messages)

  def f:((List[Task],Form[String]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (tasks,taskForm) => (messages) => apply(tasks,taskForm)(messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Sep 15 14:54:47 CEST 2015
                  SOURCE: /Applications/MAMP/htdocs/play/todolist/app/views/index.scala.html
                  HASH: 3a8c670c2bc84dca782a617e26a41095b87e336e
                  MATRIX: 553->1|735->73|763->92|790->94|815->111|854->113|890->123|955->162|968->167|993->172|1021->173|1229->354|1243->359|1256->363|1304->373|1349->390|1426->440|1439->444|1466->450|1536->493|1589->537|1629->539|1682->564|1795->646|1840->663|1890->682|1926->691|2142->880|2183->912|2223->914|2268->931|2342->978|2391->1006|2461->1048|2589->1145|2625->1154
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|30->7|31->8|31->8|31->8|31->8|39->16|39->16|39->16|39->16|40->17|41->18|41->18|41->18|43->20|43->20|43->20|44->21|45->22|46->23|47->24|48->25|57->34|57->34|57->34|58->35|59->36|59->36|61->38|63->40|64->41
                  -- GENERATED --
              */
          