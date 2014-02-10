<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title><spring:message code="views._head.title"/></title>
    
    <link rel="shortcut icon" type="image/png" href="<c:url value="/images/favicon.png" />" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link type="text/css" rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" />">
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/bootstrap-responsive.min.css" />">
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/mysample.css" />">
	<script type="text/javascript" language="javascript" src="<c:url value="/jquery/jquery-ui-1.9.2.custom/js/jquery-1.8.3.js" />" ></script>
	<script type="text/javascript" language="javascript" src="<c:url value="/jquery/jquery-ui-1.9.2.custom/js/jquery-ui-1.9.2.custom.min.js" />"></script>
    <script type="text/javascript" language="javascript" src="<c:url value="/jquery/bootstrap.min.js" />"></script>
    <script type="text/javascript" language="javascript" src="<c:url value="/jquery/application.js" />"></script>
  </head>

  <body>
	  <nav class="navbar navbar-inverse" id="navigation">
	      <div class="navbar-inner">
	      <a class="brand" href="">Sweety cup</a>
	      <ul class="nav">
	          <li><a href="">Acceuil</a></li>
	          <li><a href="">Contactez nous</a></li>
	      </ul>
	      </div>
	  </nav>
