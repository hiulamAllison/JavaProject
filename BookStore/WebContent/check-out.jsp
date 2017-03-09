<html>
<head>
<title>Check Out</title>
<script type="text/JavaScript">
function validateForm() {
	var customerName = document.checkout.customerName.value;
	var cardNumber = document.checkout.cardNumber.value;
	if (isBlank(customerName)||isBlank(cardNumber)){
		alert("Both fields cannot be left blank!");
		return false;
	}
	else
		return true;
}	

function isBlank(s) {
	var i
	for (i = 0; i < s.length; i++) {
		if (s.charAt(i) != " ")
			return false
	}
	return true
}
	
</script>
</head>
<body>
<%@page import="bookstore.*" %>
<%@page import="java.util.ArrayList" %>

	<%
		// Get the ShoppingCart object through the session object.
		// Put your code here
		ShoppingCart Cart = (ShoppingCart)session.getAttribute("cart");
		// Compute the total price of all books in the shopping cart
		double total = Cart.getTotalPrice();/* Put your code here */;
	%>
	Your total purchase is: <%=total %> <p></p>
	To purchase the item in your shopping cart, please provide us the following information:
	
	<form name="checkout" onsubmit="return validateForm()" method="post" action="ReceiptServlet">
	<b>Name: </b> <input type="text" name="customerName" size=20 value="Hung Ching MAn"><br>
	<b>Credit Card Number</b><input type="text" name="cardNumber" size=16 value="14076453D"> <br>
	<input type="submit" value="Submit Information"> &nbsp; &nbsp; &nbsp; 
	<input type="button" value="Cancel" onClick="JavaScript:window.location='show-order.jsp';">
	</form>	
	
</body>
</html>