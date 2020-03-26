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
	<h3>訂單編號: ${oid}</h3>


	<div class="bs-docs-example div-height" align='center'>
		<table id='table1' class="table table-hover">
			<thead>
				<tr>
					<th>商品編號</th>
					<th>數量</th>
					<th></th>
				</tr>
			</thead>
			<tbody id='main'>
				<c:forEach varStatus="i" var="bean" items="${orderDetail}">
					<tr>
						<td>${bean.iid}
						<td>${bean.qty}
				</c:forEach>
			</tbody>
		</table>
	</div>
<!-- 課程列表 --End -->


</body>
</html>