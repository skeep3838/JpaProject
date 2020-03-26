<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員訂單列表</title>
</head>
<body>
	<h2>會員訂單列表</h2>
	<h3>會員ID: ${cid}</h3>


	<div class="bs-docs-example div-height" align='center'>
		<table id='table1' class="table table-hover">
			<thead>
				<tr>
					<th>訂單編號</th>
					<th>訂購日期</th>
					<th>運費</th>
					<th></th>
				</tr>
			</thead>
			<tbody id='main'>
				<c:forEach varStatus="i" var="bean" items="${cOrder}">
					<tr>
						<td>${bean.oid}
						<td>${bean.createDate}
						<td>${bean.shipment}
						<td><input style='float: right;' class='btn btn-default btn-secondary btn-sm'
									type='button'onclick="javascript:location.href='${pageContext.request.contextPath}/itemline?oid=${bean.oid}'"
									value='詳細資訊' />
						
				</c:forEach>
			</tbody>
		</table>
	</div>
<!-- 課程列表 --End -->


</body>
</html>