
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(leftContent: Html)(rightContent: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""
<!DOCTYPE html>

<html>
    <head>
    <title>title</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.50*/routes/*7.56*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.50*/routes/*8.56*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*8.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.50*/routes/*9.56*/.Assets.at("stylesheets/main.css"))),format.raw/*9.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.55*/routes/*10.61*/.Assets.at("images/favicon.png"))),format.raw/*10.93*/("""">
    <script src=""""),_display_(Seq[Any](/*11.19*/routes/*11.25*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*12.63*/("""" type="text/javascript"></script>
  </head>
    <body>
      <div class="container-fluid">
          <header class="row-fluid">
              <div class=span12>
                  """),_display_(Seq[Any](/*18.20*/navigation())),format.raw/*18.32*/("""
              </div>
          </header>
          <section class="row-fluid">
               <section class="span6 offset2">
                  """),_display_(Seq[Any](/*23.20*/leftContent)),format.raw/*23.31*/("""
              </section>
              <section class="span3">
                  """),_display_(Seq[Any](/*26.20*/rightContent)),format.raw/*26.32*/("""
              </section>
          </section>
          <footer class="row-fluid">
              <div class=span12>
                  """),_display_(Seq[Any](/*31.20*/footer())),format.raw/*31.28*/("""
              </div>
          <footer>
      </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,leftContent:Html,rightContent:Html): play.api.templates.Html = apply(title)(leftContent)(rightContent)
    
    def f:((String) => (Html) => (Html) => play.api.templates.Html) = (title) => (leftContent) => (rightContent) => apply(title)(leftContent)(rightContent)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 10 00:03:43 CEST 2013
                    SOURCE: /home/chuck/Documents/Dropbox/info/personalProjects/git/poc/sweetycup/app/views/main.scala.html
                    HASH: fd1a71541fe5f2b135278afcc331c38776ee0213
                    MATRIX: 732->1|863->55|1008->165|1022->171|1082->210|1169->262|1183->268|1255->318|1342->370|1356->376|1411->410|1504->467|1519->473|1573->505|1630->526|1645->532|1712->577|1801->630|1816->636|1876->674|2093->855|2127->867|2309->1013|2342->1024|2461->1107|2495->1119|2667->1255|2697->1263
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|46->18|46->18|51->23|51->23|54->26|54->26|59->31|59->31
                    -- GENERATED --
                */
            