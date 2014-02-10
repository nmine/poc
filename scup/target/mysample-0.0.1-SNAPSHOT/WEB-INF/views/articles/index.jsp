<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>

<jsp:include page="/WEB-INF/views/_head.jsp" ></jsp:include>
	<div class="container-fluid">
          <section class="row-fluid">
               <section class="span6 offset2">
               <c:forEach items="${articles}" var="article"> 
						   <article class="article">
					              <header>
					                  <pre><div> ${article.title}</div></pre>
					                  <div>${article.author}</div>
					              </header>
					              <div>
					                  ${article.content}
					              </div>
					              <aside>
					                ${article.asideContent}
					              </aside>
					              <footer>
					                  ${article.footerContent}
					              </footer>
				          </article>
				</c:forEach>
	               	
              </section>
              <section class="span3">
	              <c:forEach items="${articles}" var="article"> 
							   <article class="article">
						              <header>
						                  <pre><div> ${article.title}</div></pre>
						                  <div>${article.author}</div>
						              </header>
						              <div>
						                  ${article.content}
						              </div>
						              <aside>
						                ${article.asideContent}
						              </aside>
						              <footer>
						                  ${article.footerContent}
						              </footer>
					          </article>
					</c:forEach>
              </section>
          </section>
      </div>
	<h1><spring:message code="views.goods.index.h1"/></h1>
	

	
<jsp:include page="/WEB-INF/views/_foot.jsp" ></jsp:include>
	