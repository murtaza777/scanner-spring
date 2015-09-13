<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<table id="responseTable">
  <tr>
    <td>Pprs Request Message Id:</td>
    <td>${response.ppsrRequestMessageId}</td>
  </tr>
  <tr>
    <td>Customer Request Message Id:</td>
    <td>${response.customersRequestMessageId}</td>
  </tr>
  <tr>
    <td>Pprs Request Processed Time:</td>
    <td>${response.requestProcessedDateTime}</td>
  </tr>
</table>