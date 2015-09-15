
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*10.112*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("bootstrap/css/bootstrap-theme.min.css")),format.raw/*11.118*/("""">

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.70*/("""" type="text/javascript"></script>

    </head>
    <body>
        <div class="container">
            """),_display_(/*19.14*/content),format.raw/*19.21*/("""
        """),format.raw/*20.9*/("""</div>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Sep 15 14:54:47 CEST 2015
                  SOURCE: /Applications/MAMP/htdocs/play/todolist/app/views/main.scala.html
                  HASH: c4ef17637dd2f40ccc0d066bcc371c13d598f065
                  MATRIX: 530->1|655->31|683->33|770->94|795->99|883->161|897->167|959->208|1043->265|1058->271|1132->323|1215->379|1230->385|1310->443|1399->505|1414->511|1475->550|1527->575|1542->581|1604->622|1735->726|1763->733|1799->742
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|34->10|34->10|34->10|35->11|35->11|35->11|37->13|37->13|37->13|38->14|38->14|38->14|43->19|43->19|44->20
                  -- GENERATED --
              */
          