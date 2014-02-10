// @SOURCE:/home/chuck/Documents/Dropbox/info/personalProjects/git/poc/pocplay/conf/routes
// @HASH:e45e02dee80755e44f6fadd00923922cae811b86
// @DATE:Tue Sep 03 01:23:20 CEST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:7
private[this] lazy val controllers_Products_index0 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Products_list1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("toto"))))
        

// @LINE:9
private[this] lazy val controllers_Products_save2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"))))
        

// @LINE:10
private[this] lazy val controllers_Products_create3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("toto/create"))))
        

// @LINE:11
private[this] lazy val controllers_Products_newProduct4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/new"))))
        

// @LINE:12
private[this] lazy val controllers_Products_details5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:13
private[this] lazy val controllers_Products_save6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/save"))))
        

// @LINE:14
private[this] lazy val controllers_StockItems_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stockitems/"))))
        

// @LINE:15
private[this] lazy val controllers_StockItems_create8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stockitems/create"))))
        

// @LINE:19
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""POST""", prefix,"""controllers.Products.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """toto""","""controllers.Products.list(page:Integer ?= 1)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/""","""controllers.Products.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """toto/create""","""controllers.Products.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/new""","""controllers.Products.newProduct()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$id<[^/]+>""","""controllers.Products.details(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/save""","""controllers.Products.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stockitems/""","""controllers.StockItems.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stockitems/create""","""controllers.StockItems.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:7
case controllers_Products_index0(params) => {
   call { 
        invokeHandler(controllers.Products.index(), HandlerDef(this, "controllers.Products", "index", Nil,"POST", """play for java""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Products_list1(params) => {
   call(params.fromQuery[Integer]("page", Some(1))) { (page) =>
        invokeHandler(controllers.Products.list(page), HandlerDef(this, "controllers.Products", "list", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """toto"""))
   }
}
        

// @LINE:9
case controllers_Products_save2(params) => {
   call { 
        invokeHandler(controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Nil,"POST", """""", Routes.prefix + """products/"""))
   }
}
        

// @LINE:10
case controllers_Products_create3(params) => {
   call { 
        invokeHandler(controllers.Products.create(), HandlerDef(this, "controllers.Products", "create", Nil,"GET", """""", Routes.prefix + """toto/create"""))
   }
}
        

// @LINE:11
case controllers_Products_newProduct4(params) => {
   call { 
        invokeHandler(controllers.Products.newProduct(), HandlerDef(this, "controllers.Products", "newProduct", Nil,"GET", """""", Routes.prefix + """products/new"""))
   }
}
        

// @LINE:12
case controllers_Products_details5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Products.details(id), HandlerDef(this, "controllers.Products", "details", Seq(classOf[Long]),"GET", """""", Routes.prefix + """products/$id<[^/]+>"""))
   }
}
        

// @LINE:13
case controllers_Products_save6(params) => {
   call { 
        invokeHandler(controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Nil,"GET", """""", Routes.prefix + """products/save"""))
   }
}
        

// @LINE:14
case controllers_StockItems_index7(params) => {
   call { 
        invokeHandler(controllers.StockItems.index(), HandlerDef(this, "controllers.StockItems", "index", Nil,"GET", """""", Routes.prefix + """stockitems/"""))
   }
}
        

// @LINE:15
case controllers_StockItems_create8(params) => {
   call { 
        invokeHandler(controllers.StockItems.create(), HandlerDef(this, "controllers.StockItems", "create", Nil,"GET", """""", Routes.prefix + """stockitems/create"""))
   }
}
        

// @LINE:19
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        