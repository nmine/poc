
package views.html.articles

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Set[Article],Form[Comments],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(articles: Set[Article],commentForm: Form[Comments]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.54*/("""
"""),_display_(Seq[Any](/*4.2*/main("Sweety cup")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
    <h2>left content</h2>
    """),_display_(Seq[Any](/*6.6*/for(article <- articles) yield /*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
      """),_display_(Seq[Any](/*7.8*/if(article.getTemplate == 1)/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
          <article class="article">
              <header>
                  <pre><div>"""),_display_(Seq[Any](/*10.30*/article/*10.37*/.getTitle)),format.raw/*10.46*/("""</div></pre>
                  <div>"""),_display_(Seq[Any](/*11.25*/article/*11.32*/.getAuthor)),format.raw/*11.42*/("""</div>
              </header>
              <div>
                  """),_display_(Seq[Any](/*14.20*/article/*14.27*/.getContent)),format.raw/*14.38*/("""
              </div>
              <aside>
                """),_display_(Seq[Any](/*17.18*/article/*17.25*/.getAsideContent)),format.raw/*17.41*/("""
              </aside>
              <footer>
                  """),_display_(Seq[Any](/*20.20*/article/*20.27*/.getFooterContent)),format.raw/*20.44*/("""
              </footer>
          </article>
      """)))})),format.raw/*23.8*/("""
    """)))})),format.raw/*24.6*/("""
    	<h4>formular</h4>
	   """),_display_(Seq[Any](/*26.6*/if(flash.containsKey("success"))/*26.38*/{_display_(Seq[Any](format.raw/*26.39*/("""
			      <div class="alert alert-success">
			      """),_display_(Seq[Any](/*28.11*/flash/*28.16*/.get("success"))),format.raw/*28.31*/("""
				      </div>
	   """)))})),format.raw/*30.6*/("""
	   """),_display_(Seq[Any](/*31.6*/if(flash.containsKey("error"))/*31.36*/{_display_(Seq[Any](format.raw/*31.37*/("""
				    <div class="alert alert-error">
				    """),_display_(Seq[Any](/*33.10*/flash/*33.15*/.get("error"))),format.raw/*33.28*/("""
				    </div>
	  """)))})),format.raw/*35.5*/("""
	  """),_display_(Seq[Any](/*36.5*/helper/*36.11*/.form(action = routes.Application.saveComments(),
	    'enctype -> "multipart/form-data")/*37.40*/ {_display_(Seq[Any](format.raw/*37.42*/("""
	    <fieldset>
	    """),_display_(Seq[Any](/*39.7*/helper/*39.13*/.inputText(commentForm("author")))),format.raw/*39.46*/("""
	    """),_display_(Seq[Any](/*40.7*/helper/*40.13*/.textarea(commentForm("content")))),format.raw/*40.46*/("""
	    </fieldset>
	    <input type="submit" class="btn btn-primary">
	  """)))})),format.raw/*43.5*/("""
""")))}/*44.2*/ {_display_(Seq[Any](format.raw/*44.4*/("""
    <h2>left content</h2>
    """),_display_(Seq[Any](/*46.6*/for(article <- articles) yield /*46.30*/ {_display_(Seq[Any](format.raw/*46.32*/("""
        """),_display_(Seq[Any](/*47.10*/if(article.getTemplate == 2)/*47.38*/ {_display_(Seq[Any](format.raw/*47.40*/("""
          <article class="article">
          <header>
              <pre><div>"""),_display_(Seq[Any](/*50.26*/article/*50.33*/.getTitle)),format.raw/*50.42*/("""</div></pre>
              <div>"""),_display_(Seq[Any](/*51.21*/article/*51.28*/.getAuthor)),format.raw/*51.38*/("""</div>
          </header>
          <div>
              """),_display_(Seq[Any](/*54.16*/article/*54.23*/.getContent)),format.raw/*54.34*/("""
          </div>
          <aside>
            """),_display_(Seq[Any](/*57.14*/article/*57.21*/.getAsideContent)),format.raw/*57.37*/("""
          </aside>
          <footer>
              """),_display_(Seq[Any](/*60.16*/article/*60.23*/.getFooterContent)),format.raw/*60.40*/("""
          </footer>
          </article>
        """)))})),format.raw/*63.10*/("""
    """)))})),format.raw/*64.6*/("""
""")))})),format.raw/*65.2*/("""
"""))}
    }
    
    def render(articles:Set[Article],commentForm:Form[Comments]): play.api.templates.Html = apply(articles,commentForm)
    
    def f:((Set[Article],Form[Comments]) => play.api.templates.Html) = (articles,commentForm) => apply(articles,commentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 10 01:42:18 CEST 2013
                    SOURCE: /home/chuck/Documents/Dropbox/info/personalProjects/git/poc/sweetycup/app/views/articles/list.scala.html
                    HASH: fe3fe4e5b8a191e43b83c6a696e80d84f0b0aef3
                    MATRIX: 752->1|931->53|967->106|993->124|1032->126|1098->158|1137->182|1176->184|1218->192|1254->220|1293->222|1418->311|1434->318|1465->327|1538->364|1554->371|1586->381|1692->451|1708->458|1741->469|1838->530|1854->537|1892->553|1994->619|2010->626|2049->643|2133->696|2170->702|2234->731|2275->763|2314->764|2404->818|2418->823|2455->838|2509->861|2550->867|2589->897|2628->898|2714->948|2728->953|2763->966|2814->986|2854->991|2869->997|2967->1086|3007->1088|3065->1111|3080->1117|3135->1150|3177->1157|3192->1163|3247->1196|3351->1269|3371->1271|3410->1273|3477->1305|3517->1329|3557->1331|3603->1341|3640->1369|3680->1371|3797->1452|3813->1459|3844->1468|3913->1501|3929->1508|3961->1518|4055->1576|4071->1583|4104->1594|4189->1643|4205->1650|4243->1666|4333->1720|4349->1727|4388->1744|4471->1795|4508->1801|4541->1803
                    LINES: 26->1|32->1|33->4|33->4|33->4|35->6|35->6|35->6|36->7|36->7|36->7|39->10|39->10|39->10|40->11|40->11|40->11|43->14|43->14|43->14|46->17|46->17|46->17|49->20|49->20|49->20|52->23|53->24|55->26|55->26|55->26|57->28|57->28|57->28|59->30|60->31|60->31|60->31|62->33|62->33|62->33|64->35|65->36|65->36|66->37|66->37|68->39|68->39|68->39|69->40|69->40|69->40|72->43|73->44|73->44|75->46|75->46|75->46|76->47|76->47|76->47|79->50|79->50|79->50|80->51|80->51|80->51|83->54|83->54|83->54|86->57|86->57|86->57|89->60|89->60|89->60|92->63|93->64|94->65
                    -- GENERATED --
                */
            