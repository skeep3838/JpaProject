<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員列表</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
</head>
<body>
	<h2>商品列表</h2>
	<h3>客戶ID: ${cid}</h3>

	<div class="bs-docs-example div-height" align='center'>
		<form method="post" action="${pageContext.request.contextPath}/items">
			<table id='table1' class="table table-hover">
				<thead>
					<tr>
						<th>商品編碼</th>
						<th>商品名稱</th>
						<th>商品描述</th>
						<th>商品價格</th>
						<th>購買數量</th>
					</tr>
				</thead>
				<tbody id='main'>
					<c:forEach varStatus="i" var="bean" items="${itemList}">
						<tr>
							<td>${bean.iid}
							<td>${bean.iname}
							<td>${bean.description}
							<td>${bean.price}
							<td><input type="number" id="qty${bean.iid}" name="qty${bean.iid}" value=0>
							<td><input type="button" onclick="shopCart(${bean.iid})" value="加入購物車">				
					</c:forEach>
				</tbody>
			</table>
			<input type="hidden" id="cid" name="cid" value="${cid}">
<!-- 			<input type="hidden" id="shopCa" name="shopCa" value=0> -->
			<input type="submit"  value="確定購買">	
		</form>
	</div>
<!-- 課程列表 --End -->
	<script>
		var shopCartStr=[];
		function shopCart(item){
			var itemId = "qty"+item;
			var oneItem={
				iid: item,
				qty: document.getElementById(itemId).value,
			};
			shopCartStr[shopCartStr.length]=oneItem;
			$("#shopCa").val(JSON.stringify(shopCartStr));
// 			document.getElementById(shopCa).value=JSON.stringify(shopCartStr);
			alert($("#shopCa").val(JSON.stringify(shopCartStr)));
			
			
		}
	</script>
</body>
</html>