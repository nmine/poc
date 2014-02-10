
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
<nav class="navbar navbar-inverse" id="navigation">
      <div class="navbar-inner">
      <a class="brand" href="">Sweety cup</a>
      <ul class="nav">
          <li><a href="">Acceuil</a></li>
          <li><a href="">Contactez nous</a></li>
      </ul>
      </div>
</nav>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 10 00:03:43 CEST 2013
                    SOURCE: /home/chuck/Documents/Dropbox/info/personalProjects/git/poc/sweetycup/app/views/navigation.scala.html
                    HASH: f6449ae11f6ffe7af738bda4685c720b039eb969
                    MATRIX: 721->1|799->3
                    LINES: 26->1|29->1
                    -- GENERATED --
                */
            