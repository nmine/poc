
package views.html.products

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Set[Product],String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(products: Set[Product], m : String ):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""
"""),_display_(Seq[Any](/*2.2*/main("Products catalogue")/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
  <h1>All products</h1>
  <dl>
  """),_display_(Seq[Any](/*5.4*/for((product, i) <- products.zipWithIndex) yield /*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
    <dt>
    <a href=""""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.Products.details(product.id))),format.raw/*7.50*/("""">
    <i class="icon icon-pencil"></i>
    <span class="badge badge-info">"""),_display_(Seq[Any](/*9.37*/i)),format.raw/*9.38*/(""" </span>- """),_display_(Seq[Any](/*9.49*/product/*9.56*/.ean)),format.raw/*9.60*/(""" - """),_display_(Seq[Any](/*9.64*/product/*9.71*/.name)),format.raw/*9.76*/("""
    </a>
    </dt>
    <dd>"""),_display_(Seq[Any](/*12.10*/product/*12.17*/.description)),format.raw/*12.29*/("""</dd>
    """),_display_(Seq[Any](/*13.6*/m)),format.raw/*13.7*/("""
  """)))})),format.raw/*14.4*/("""
  </dl>
  <a href=""""),_display_(Seq[Any](/*16.13*/routes/*16.19*/.Products.newProduct())),format.raw/*16.41*/("""" class="btn">
  <i class="icon-plus"></i> New product</a>
""")))})))}
    }
    
    def render(products:Set[Product],m:String): play.api.templates.Html = apply(products,m)
    
    def f:((Set[Product],String) => play.api.templates.Html) = (products,m) => apply(products,m)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 03 00:30:07 CEST 2013
                    SOURCE: /home/chuck/Documents/Dropbox/info/personalProjects/git/poc/pocplay/app/views/products/list.scala.html
                    HASH: 4cf7729a9520fe622f3f301fdad1b72b189b39ac
                    MATRIX: 744->1|858->38|894->40|928->66|967->68|1036->103|1093->145|1132->147|1191->171|1205->177|1255->206|1366->282|1388->283|1434->294|1449->301|1474->305|1513->309|1528->316|1554->321|1619->350|1635->357|1669->369|1715->380|1737->381|1772->385|1829->406|1844->412|1888->434
                    LINES: 26->1|29->1|30->2|30->2|30->2|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|37->9|37->9|37->9|37->9|37->9|37->9|40->12|40->12|40->12|41->13|41->13|42->14|44->16|44->16|44->16
                    -- GENERATED --
                */
            