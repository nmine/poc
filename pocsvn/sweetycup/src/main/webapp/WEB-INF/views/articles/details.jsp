<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ page session="false"%>
<jsp:include page="/WEB-INF/views/_head.jsp"></jsp:include>

<div class="container-fluid">
	<section class="row-fluid">
		<section class="span6 offset2">
			<c:url var="createDetailsUrl" value="/articles/detailsCreate" />
			<sf:form id="formDetails" method="POST" action="${createDetailsUrl}"
				modelAttribute="comment" class="form-horizontal">
				<pre>
								<span class="text-warning">Person</span>
							</pre>
				<div class="control-group">
					<label class="control-label">Name</label>
					<div class="controls">
						<input id="personName" class="input-medium" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">Email</label>
					<div class="controls">
						<input id="personEmail" class="input-medium" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">Pseudo</label>
					<div class="controls">
						<textarea id="personPseudo" class="input-medium"></textarea>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<input type="submit" value="Create">
					</div>
				</div>
			</sf:form>
			<table id="tablePerson" class="table table-hover"></table>
		</section>
	</section>
</div>
<%-- 	<spring:message code="views.goods.index.h1"/> --%>



<jsp:include page="/WEB-INF/views/_foot.jsp"></jsp:include>
