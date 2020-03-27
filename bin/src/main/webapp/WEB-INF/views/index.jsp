<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員列表</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2>會員列表</h2>
		<div class="bs-docs-example div-height" align='center'>
			<table id='table1' class="table table-hover">
				<thead>
					<tr>
						<th>會員id</th>
						<th>會員名稱</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody id='main'>
					<c:forEach varStatus="i" var="bean" items="${customers}">
						<tr>
							<td>${bean.cid}
							<td>${bean.cname}
							<td><input style='float: right;' class='btn btn-primary'
										type='button'onclick="javascript:location.href='${pageContext.request.contextPath}/items?cid=${bean.cid}'"
										value='商品清單' />
							<td><input style='float: right;' class='btn btn-primary'
										type='button'onclick="javascript:location.href='${pageContext.request.contextPath}/order?cid=${bean.cid}'"
										value='訂單查詢' />
										
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>