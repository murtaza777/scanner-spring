<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form method="POST" commandName="form" action="pingResponse" id="requestForm">
  <table id="requestTable">
    <tr>
      <td>Username</td>
      <td><form:input path="username"/></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><form:password path="password"/></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="POST"/></td>
    </tr>
  </table>
</form:form>
