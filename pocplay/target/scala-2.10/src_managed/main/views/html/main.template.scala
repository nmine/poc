
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*9.99*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/glyphicons-halflings-white.png"))),format.raw/*11.116*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.59*/routes/*12.65*/.Assets.at("images/glyphicons-halflings.png"))),format.raw/*12.110*/("""">
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*13.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*14.67*/("""" type="text/javascript"></script>
    </head>
    <body>
    <div class="container">
      """),_display_(Seq[Any](/*18.8*/navigation())),format.raw/*18.20*/("""
            <div id="home_panel">
                <!--Jumbotron tab Heigth -->
                <div >
                    <div class="row">
                      <div class="span8 offset4">
                      """),_display_(Seq[Any](/*24.24*/if(flash.containsKey("success"))/*24.56*/{_display_(Seq[Any](format.raw/*24.57*/("""
                    <div class="alert alert-success">
                    """),_display_(Seq[Any](/*26.22*/flash/*26.27*/.get("success"))),format.raw/*26.42*/("""
                    </div>
                    """)))})),format.raw/*28.22*/("""
                    """),_display_(Seq[Any](/*29.22*/if(flash.containsKey("error"))/*29.52*/{_display_(Seq[Any](format.raw/*29.53*/("""
                    <div class="alert alert-error">
                    """),_display_(Seq[Any](/*31.22*/flash/*31.27*/.get("error"))),format.raw/*31.40*/("""
                    </div>
                """)))})),format.raw/*33.18*/("""
                      """),_display_(Seq[Any](/*34.24*/content)),format.raw/*34.31*/("""
                      </div>
                    </div>
                </div>
            </div>

            <hr>

            <div class="footer">
                <p>&copy; Company 2013</p>
            </div>

        </div> <!-- /container -->

      </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 03 00:30:07 CEST 2013
                    SOURCE: /home/chuck/Documents/Dropbox/info/personalProjects/git/poc/pocplay/app/views/main.scala.html
                    HASH: 27cc0b3440fcbf80aa1feafb440404d5872668eb
                    MATRIX: 727->1|834->31|922->84|948->89|1045->151|1059->157|1114->191|1205->247|1219->253|1279->292|1376->353|1391->359|1445->391|1542->452|1557->458|1631->509|1728->570|1743->576|1811->621|1872->646|1887->652|1954->697|2047->754|2062->760|2122->798|2250->891|2284->903|2534->1117|2575->1149|2614->1150|2726->1226|2740->1231|2777->1246|2858->1295|2916->1317|2955->1347|2994->1348|3104->1422|3118->1427|3153->1440|3230->1485|3290->1509|3319->1516
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|46->18|46->18|52->24|52->24|52->24|54->26|54->26|54->26|56->28|57->29|57->29|57->29|59->31|59->31|59->31|61->33|62->34|62->34
                    -- GENERATED --
                */
            