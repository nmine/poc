<%@page import="net.tanesha.recaptcha.ReCaptchaFactory"%>
<%@page import="net.tanesha.recaptcha.ReCaptcha"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<script type="text/javascript">var RecaptchaOptions = {theme : 'clean'};</script> 

<%@ page session="false" %>
<jsp:include page="/WEB-INF/views/_head.jsp" ></jsp:include>
	<div class="container-fluid">
          <section class="row-fluid">
               <section class="span6 offset2">
		               <c:forEach items="${articles}" var="article"> 
								   <article class="article">
							              <header>
							                  <pre>${article.title}</pre>
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
					   <div id="games" class="offset2">
				
								<a href="http://www.minininjas.com/" target="_blank">
									<img src="http://workshop.rs/projects/coin-slider/games/batman_arkham_asylum.jpg alt="Mini Ninjas" />
									<span>
										<b>Mini Ninjas</b><br />
										Your quest to defeat the Evil Samurai Warlord has begun. Control the powers of nature, possess creatures, use your
										furious Ninja skills to free your Ninja friends.
									</span>
								</a>
					
								<a href="http://www.princeofpersiagame.com/" target="_blank">
									<img src="http://workshop.rs/projects/coin-slider/games/prince_of_persia.jpg" alt="Price of Persia" />
								</a>
					
								<a href="http://spidermandimensions.marvel.com/" target="_blank">
									<img src="http://workshop.rs/projects/coin-slider/games/spiderman_shattered_dimensions.jpg"" alt="Spiderman: Shattered Dimensions" />
								</a>
					
								<a href="http://brinkthegame.com/" target="_blank">
									<img src="http://workshop.rs/projects/coin-slider/games/brink.jpg" alt="Brink" />
								</a>
					
								<a href="http://www.godofwar.com/" target="_blank" >
									<img src="http://workshop.rs/projects/coin-slider/games/batman_arkham_asylum.jpg" alt="God of War III" />
								</a>
					
								<a href="http://www.borderlandsthegame.com/" target="_blank">
									<img src="http://workshop.rs/projects/coin-slider/games/borderlands.jpg" alt="Borderlands" />
									<span>
										<b>Borderlands</b><br />
										Fun combat and a steady flow of rewards make this journey a massively enjoyable one, especially with some fellow mercenaries along for the ride.
									</span>
								</a>
					
								<a href="http://www.swtor.com/" target="_blank">
									<img src="http://workshop.rs/projects/coin-slider/games/star_wars_the_old_republic.jpg" alt="Star Wars: The Old Republic" />
								</a>
					
								<a href="http://www.batmanarkhamasylum.com/" target="_blank">
									<img src="http://workshop.rs/projects/coin-slider/games/batman_arkham_asylum.jpg" alt="Batman: Arkham Asylum" />
								</a>
					  </div>
						<section id="mail_form">
							<c:url var="createMailMessageUrl" value="/articles/message" />
							<sf:form method="POST" action="${createMailMessageUrl}" modelAttribute="mailMessage" class="form-horizontal">
								<table class="table table-bordered">
									<tr>
										<td>
											<pre><span class="text-info">Formulaire de contact</span></pre>
											<div class="control-group">
												<label class="control-label" >Email</label>
												<div class="controls">
													<sf:input  path="email" size="100" maxlength="100"  class="input-medium"  />
													<sf:errors path="email" cssClass="error" /> 
												</div>
											</div>
											<div class="control-group">
												<label class="control-label" >Message</label>
												<div class="controls">
													<sf:textarea  path="content" size="500" maxlength="500"  class="input-medium"  />
													<sf:errors path="content" cssClass="error" /> 
												</div>
											</div>
											<div class="control-group">
												<div class="controls">
														<%
														    ReCaptcha reCaptcha = ReCaptchaFactory.newReCaptcha("6LfBDugSAAAAAKLmw9Gd3p9r1GcwRf-HZj_tA5fC", "6LfBDugSAAAAAPzq00aVA9tjCDqYuhFiKg2NnZEn", false);
														    out.print(reCaptcha.createRecaptchaHtml(null, null));
														%>
														<c:if test="${captchaInvalid}">
															<c:out value="error captcha"></c:out>
														</c:if>
														<c:if test="${successFormMailMessage}">
															<script>
															$( document ).ready(function() {
																$.pnotify({
																    title: 'Succès',
																    text: 'Votre message a bien été envoyé',
																    type: 'success',
																    styling: 'bootstrap'
																});
															});
														    </script>
														</c:if>
														<c:if test="${locationFormMessage}">
														    <script>
															$( document ).ready(function() {
																location.href = "#email";
															});
														    </script>
														</c:if>
												</div>
											</div>
											<div class="control-group">
												<div class="controls">
													<input type="submit" value='Envoyer' class="btn btn-primary" href="#message"/>	
												</div>
											</div>
										</td>
									</tr>
								</table>
							</sf:form>
						</section>		
			          <c:url var="createCommentUrl" value="/articles" />
					  <sf:form method="POST" action="${createCommentUrl}" modelAttribute="comment" class="form-horizontal">
					  	<table class="table table-bordered">
					   		<tr>
								<td>
									<pre><span class="text-warning">Livre d'or</span></pre>
									<div class="control-group">
										<label class="control-label" >Pseudo</label>
										<div class="controls">
											<sf:input id="articlePseudo" path="pseudo" size="100" maxlength="100"  class="input-medium"  />
											<sf:errors path="pseudo" cssClass="error" /> 
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" >Email</label>
										<div class="controls">
											<sf:input id="articleEmail" path="email" size="100" maxlength="100"  class="input-medium"  />
											<sf:errors path="email" cssClass="error" /> 
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" >Content</label>
										<div class="controls">
											<sf:textarea id="articleContent" path="content"  size="500" maxlength="500" class="input-medium"  />
											<sf:errors path="content" cssClass="error" /> 
										</div>
									</div>
									<div class="control-group">
										<div class="controls">
											<input type="submit" value='Envoyer' class="btn btn-primary" href="#comment"/>	
										</div>
										<c:if test="${successFormComment}">
											<script>
											$( document ).ready(function() {
												$.pnotify({
												    title: 'Succès',
												    text: 'Votre commentaire a été ajouté',
												    type: 'success',
												    styling: 'bootstrap'
												});
											});
										    </script>
										</c:if>
										<c:if test="${locationFormComment}">
										    <script>
											$( document ).ready(function() {
												location.href = "#comment";
											});
										    </script>
										</c:if>
									</div>
								</td>
							</tr>
						</table>
					</sf:form>
		        <table class="table table-bordered">
			           <c:forEach items="${comments}" var="commentToDisplay"> 
			           		<tr>
									   <td>
											${commentToDisplay.pseudo}
								       </td>
								       <td> 
								       		${commentToDisplay.email}
								       </td>
								       <td>
											${commentToDisplay.content}
								       </td>
							</tr>
						</c:forEach>
				</table>     	
              </section>
              <section class="span3">
	              <c:forEach items="${articles}" var="article"> 
							   <article class="article">
						              <header>
						                  <pre>${article.title}</pre>
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
              <gcse:search></gcse:search>
              </section>
          </section>
      </div>
<%-- 	<spring:message code="views.goods.index.h1"/> --%>
	

	
<jsp:include page="/WEB-INF/views/_foot.jsp" ></jsp:include>
	