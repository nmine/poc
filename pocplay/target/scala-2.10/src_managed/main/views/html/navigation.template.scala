
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
object navigation extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply/*1.2*/():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<nav class="navbar navbar-inverse navbar-fixed-top" id="navigation">
      <div class="navbar-inner">
      <div class="container">
      <a class="brand" href=""""),_display_(Seq[Any](/*5.31*/routes/*5.37*/.Products.index())),format.raw/*5.54*/("""">Products Catalog</a>
      <ul class="nav">
          <li><a href=""""),_display_(Seq[Any](/*7.25*/routes/*7.31*/.Products.index())),format.raw/*7.48*/("""">Home</a></li>
          <li><a href=""""),_display_(Seq[Any](/*8.25*/routes/*8.31*/.Products.list())),format.raw/*8.47*/("""">Products</a></li>
          <li><a href="">Contact</a></li>
      </ul>
      </div>
    </div>
</nav>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 03 00:30:07 CEST 2013
                    SOURCE: /home/chuck/Documents/Dropbox/info/personalProjects/git/poc/pocplay/app/views/navigation.scala.html
                    HASH: ff73f5152c52099439fa7e227a74129a057f6e2f
                    MATRIX: 721->1|799->3|997->166|1011->172|1049->189|1154->259|1168->265|1206->282|1281->322|1295->328|1332->344
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8
                    -- GENERATED --
                */
            