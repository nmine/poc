
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
object details extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Product],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(productForm: Form[Product]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.30*/("""
"""),_display_(Seq[Any](/*4.2*/main("Product form")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
  <h1>Product form</h1>
  """),_display_(Seq[Any](/*6.4*/helper/*6.10*/.form(action = routes.Products.save(),
    'enctype -> "multipart/form-data")/*7.39*/ {_display_(Seq[Any](format.raw/*7.41*/("""
    <fieldset>
    <legend>Product ("""),_display_(Seq[Any](/*9.23*/productForm("name")/*9.42*/.valueOr("New"))),format.raw/*9.57*/(""")</legend>
    """),_display_(Seq[Any](/*10.6*/helper/*10.12*/.inputText(productForm("ean")))),format.raw/*10.42*/("""
    """),_display_(Seq[Any](/*11.6*/helper/*11.12*/.inputText(productForm("name")))),format.raw/*11.43*/("""
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.textarea(productForm("description")))),format.raw/*12.49*/("""
   <div class="control-group">
      <div class="controls">
          <input name="tags[0].id" value="1" type="checkbox"
          """),_display_(Seq[Any](/*16.12*/for(i <- 0 to 2) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
            """),_display_(Seq[Any](/*17.14*/if(productForm("tags[" + i + "].id").value=="1")/*17.62*/{_display_(Seq[Any](format.raw/*17.63*/("""
              checked
            """)))})),format.raw/*19.14*/("""
          """)))})),format.raw/*20.12*/("""> lightweight
          <input name="tags[1].id" value="2" type="checkbox"
          """),_display_(Seq[Any](/*22.12*/for(i <- 0 to 2) yield /*22.28*/ {_display_(Seq[Any](format.raw/*22.30*/("""
              """),_display_(Seq[Any](/*23.16*/if(productForm("tags[" + i + "].id").value=="2")/*23.64*/{_display_(Seq[Any](format.raw/*23.65*/("""
                checked
              """)))})),format.raw/*25.16*/("""
          """)))})),format.raw/*26.12*/("""> metal
          <input name="tags[2].id" value="3" type="checkbox"
          """),_display_(Seq[Any](/*28.12*/for(i <- 0 to 2) yield /*28.28*/ {_display_(Seq[Any](format.raw/*28.30*/("""
              """),_display_(Seq[Any](/*29.16*/if(productForm("tags[" + i + "].id").value=="3")/*29.64*/{_display_(Seq[Any](format.raw/*29.65*/("""
                 checked
              """)))})),format.raw/*31.16*/("""
          """)))})),format.raw/*32.12*/("""> plastic
      </div>
    </fieldset>
    <input type="submit" class="btn btn-primary">
  """)))})),format.raw/*36.4*/("""
""")))})))}
    }
    
    def render(productForm:Form[Product]): play.api.templates.Html = apply(productForm)
    
    def f:((Form[Product]) => play.api.templates.Html) = (productForm) => apply(productForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 03 00:30:07 CEST 2013
                    SOURCE: /home/chuck/Documents/Dropbox/info/personalProjects/git/poc/pocplay/app/views/products/details.scala.html
                    HASH: 14967aee1134430e94fbe30c269ff99b2ab588b8
                    MATRIX: 741->1|896->29|932->82|960->102|999->104|1061->132|1075->138|1160->215|1199->217|1272->255|1299->274|1335->289|1386->305|1401->311|1453->341|1494->347|1509->353|1562->384|1603->390|1618->396|1677->433|1846->566|1878->582|1918->584|1968->598|2025->646|2064->647|2132->683|2176->695|2298->781|2330->797|2370->799|2422->815|2479->863|2518->864|2590->904|2634->916|2750->996|2782->1012|2822->1014|2874->1030|2931->1078|2970->1079|3043->1120|3087->1132|3210->1224
                    LINES: 26->1|32->1|33->4|33->4|33->4|35->6|35->6|36->7|36->7|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|45->16|45->16|45->16|46->17|46->17|46->17|48->19|49->20|51->22|51->22|51->22|52->23|52->23|52->23|54->25|55->26|57->28|57->28|57->28|58->29|58->29|58->29|60->31|61->32|65->36
                    -- GENERATED --
                */
            