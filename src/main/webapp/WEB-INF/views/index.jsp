<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員列表</title>
</head>
<body>
	<h2>會員列表</h2>


	<div class="bs-docs-example div-height" align='center'>
		<table id='table1' class="table table-hover">
			<thead>
				<tr>
					<th>會員id</th>
					<th>會員名稱</th>
					<th></th>
				</tr>
			</thead>
			<tbody id='main'>
				<c:forEach varStatus="i" var="bean" items="${customers}">
					<tr>
						<td>${bean.cid}
						<td>${bean.cname}
						<td><input style='float: right;' class='btn btn-default btn-secondary btn-sm'
									type='button'onclick="javascript:location.href='${pageContext.request.contextPath}/items?cid=${bean.cid}'"
									value='商品清單' />
						<td><input style='float: right;' class='btn btn-default btn-secondary btn-sm'
									type='button'onclick="javascript:location.href='${pageContext.request.contextPath}/order?cid=${bean.cid}'"
									value='訂單查詢' />
									
				</c:forEach>
			</tbody>
		</table>
	</div>
<!-- 課程列表 --End -->


</body>
</html>