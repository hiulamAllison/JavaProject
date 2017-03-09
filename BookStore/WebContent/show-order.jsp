
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Show Order</title>
</head>
<body>

<%@page import="bookstore.*" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Date" %>
	<p>Student Name: Hung Ching Man, Kua Hiu Lam<br/>
	Student ID	: 14076453D, 14076439D<br/>
	</p>
	<center>The time now is: <%= new Date() %></center>
	<%
	ShoppingCart Cart = (ShoppingCart)session.getAttribute("cart");
	int numBooks = Cart.size();
		// Get the shopping cart object. From the cart object, get the number of books
		// Put your code here
		

	%>
	<p style="text-align: center;">
		You have <%= numBooks %> item(s) in your shopping cart <br> 
	</p>
	<% if (numBooks > 0) { %>	
		<table align="center" border=1  >
		<tr>
			<th></th>
			<th>Title</th>
			<th>Price</th>
		</tr>
		<% for (int i=0; i<numBooks; i++) { %>
				<tr>
					<td><%=i+1 %></td> 
					<td><%=Cart.getBook(i).getTitle() %>
					<td><%=Cart.getBook(i).getPrice() %>
					<!-- Get the title and price of the i-th book in the shopping cart -->
					<!-- Put your code here -->
				</tr>
		<% } %>
		<tr>
			<td></td>
			<td>Total:</td>
			<td><%=Cart.getTotalPrice()%></td> 
			<!-- Get the total price -->
			<!-- Put your code here -->
		</table>
	<% } %>	
	<center>
		<input type="button" value="Back" onClick="JavaScript:window.location='BookInfo.jsp';">
		<input type="button" value="Check Out" onClick="JavaScript:window.location='check-out.jsp';"> &nbsp; &nbsp;
		<input type="button" value="Remove All" onClick="JavaScript:window.location='remove-all.jsp';">
	</center>
	
	
</body>
</html>