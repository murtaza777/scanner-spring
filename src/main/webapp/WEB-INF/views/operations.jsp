<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <script type="text/javascript" src="<c:url value='/js/jquery-1.11.0.min.js'/>"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/dropdown.js"></script>
  <link rel="stylesheet" type="text/css" href="<c:url value='/css/visible.css'/>"/>
  <script>var ctx = "${pageContext.request.contextPath}"</script>
  <title>PPSR Operations</title>
</head>
<body>
<%--<table id="selectionTable">
  <tr id="selection">
    <td>Select an operation:</td>
    <td>--%>
<div id="selection">
  <div>
    <span>Select an operation:</span>
    <select id="dropdown">
      <option selected="selected" value="blank" label="--Select operation--">--Select operation--</option>
      <c:forEach items="${operationsMap}" var="operation">
        <option value="${operation.key}" label="${operation.value}">${operation.value}</option>
      </c:forEach>
      <%--<options items="${operationsMap}"/>--%>
    </select>
  </div>

</div>
    <%--</td>
  </tr>
 </table>--%>
<%--<form:form method="POST" commandName="operation" action="/response">
  <table>
    <tr>
      <td>Username</td>
      <td><form:input path="username"/></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><form:password path="password"/></td>
    </tr>
    <tr>
      <td>Select an operation:</td>
      <td>
        <form:select path="operationName" id="dropdown">
          <form:option value="-" label="--Select phone--">
            <form:options items="${operationsMap}"/>
          </form:option>
        </form:select>
      </td>
    </tr>
    <tr id="postRequest">
      <td colspan="2"><input type="submit" value="POST"/></td>
    </tr>
  </table>
</form:form>--%>
</body>
</html>
