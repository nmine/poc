// @SOURCE:/home/chuck/Documents/Dropbox/info/personalProjects/git/poc/pocplay/conf/routes
// @HASH:e45e02dee80755e44f6fadd00923922cae811b86
// @DATE:Tue Sep 03 01:23:20 CEST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:19
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseProducts {
    

// @LINE:12
def details(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:11
def newProduct(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/new")
}
                                                

// @LINE:10
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "toto/create")
}
                                                

// @LINE:13
// @LINE:9
def save(): Call = {
   () match {
// @LINE:9
case () if true => Call("POST", _prefix + { _defaultPrefix } + "products/")
                                                        
// @LINE:13
case () if true => Call("GET", _prefix + { _defaultPrefix } + "products/save")
                                                        
   }
}
                                                

// @LINE:7
def index(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:8
def list(page:Integer = 1): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "toto" + queryString(List(if(page == 1) None else Some(implicitly[QueryStringBindable[Integer]].unbind("page", page)))))
}
                                                
    
}
                          

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
class ReverseStockItems {
    

// @LINE:14
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "stockitems/")
}
                                                

// @LINE:15
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "stockitems/create")
}
                                                
    
}
                          
}
                  


// @LINE:19
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.javascript {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseProducts {
    

// @LINE:12
def details : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.details",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def newProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.newProduct",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/new"})
      }
   """
)
                        

// @LINE:10
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toto/create"})
      }
   """
)
                        

// @LINE:13
// @LINE:9
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.save",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products/"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/save"})
      }
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.index",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:8
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.list",
   """
      function(page) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toto" + _qS([(page == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("page", page))])})
      }
   """
)
                        
    
}
              

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
class ReverseStockItems {
    

// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StockItems.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stockitems/"})
      }
   """
)
                        

// @LINE:15
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StockItems.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stockitems/create"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:19
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.ref {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseProducts {
    

// @LINE:12
def details(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.details(id), HandlerDef(this, "controllers.Products", "details", Seq(classOf[Long]), "GET", """""", _prefix + """products/$id<[^/]+>""")
)
                      

// @LINE:11
def newProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.newProduct(), HandlerDef(this, "controllers.Products", "newProduct", Seq(), "GET", """""", _prefix + """products/new""")
)
                      

// @LINE:10
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.create(), HandlerDef(this, "controllers.Products", "create", Seq(), "GET", """""", _prefix + """toto/create""")
)
                      

// @LINE:9
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Seq(), "POST", """""", _prefix + """products/""")
)
                      

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.index(), HandlerDef(this, "controllers.Products", "index", Seq(), "POST", """play for java""", _prefix + """""")
)
                      

// @LINE:8
def list(page:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.list(page), HandlerDef(this, "controllers.Products", "list", Seq(classOf[Integer]), "GET", """""", _prefix + """toto""")
)
                      
    
}
                          

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
class ReverseStockItems {
    

// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StockItems.index(), HandlerDef(this, "controllers.StockItems", "index", Seq(), "GET", """""", _prefix + """stockitems/""")
)
                      

// @LINE:15
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StockItems.create(), HandlerDef(this, "controllers.StockItems", "create", Seq(), "GET", """""", _prefix + """stockitems/create""")
)
                      
    
}
                          
}
                  
      