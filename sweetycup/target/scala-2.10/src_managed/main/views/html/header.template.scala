
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
object header extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply/*1.2*/():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<head>
    <title>title</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*4.50*/routes/*4.56*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*4.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*5.50*/routes/*5.56*/.Assets.at("stylesheets/main.css"))),format.raw/*5.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.55*/routes/*6.61*/.Assets.at("images/favicon.png"))),format.raw/*6.93*/("""">
    <script src=""""),_display_(Seq[Any](/*7.19*/routes/*7.25*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*7.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*8.19*/routes/*8.25*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*8.63*/("""" type="text/javascript"></script>
</head>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 10 00:03:43 CEST 2013
                    SOURCE: /home/chuck/Documents/Dropbox/info/personalProjects/git/poc/sweetycup/app/views/header.scala.html
                    HASH: 6089720c403d1a233086ac82ecfc89f7e5f03b69
                    MATRIX: 717->1|795->3|912->85|926->91|998->141|1085->193|1099->199|1154->233|1246->290|1260->296|1313->328|1369->349|1383->355|1449->400|1537->453|1551->459|1610->497
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8
                    -- GENERATED --
                */
            