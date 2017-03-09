package bookstore;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/show-order.jsp";
		ShoppingCart cart;
		ArrayList<Book> books;
		HttpSession session = request.getSession(false);
		if (session == null){
			String home = "/SearchBook.html";
			ServletContext context = getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher(home);
			dispatcher.forward(request, response);	
			return;
		}	
		if (session.getAttribute("cart") == null)
			session.setAttribute("cart", new ShoppingCart());
		cart = (ShoppingCart)session.getAttribute("cart");
	    books = (ArrayList<Book>)session.getAttribute("foundBooks");
		Book selected = books.get(Integer.parseInt(request.getParameter("selectedBook")));		
		cart.addBook(selected);
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(url);
		dispatcher.forward(request, response);	
		// Get the session object, making sure that the user cannot access this servlet directly
		// If the user attempts to accesses this servlet directly, forward the user to he/she
		// SearchBook.html.
		
		/* Put your code here */
	
		
		// Get the ShoppingCart object (namely cart) from the session object. 
		// If cart is null, create a new ShoppingCart object and create an
		// association between the String "bookstore.cart" and the newly created object.
		
		
		
		// Get the ArrayList object (namely books) from the session object. This ArrayList
		// object, which was created in QueryServlet.class, contains the book objects that
		// match the search criteria specified in SearchBook.html
		
		
		
		/* Put your code here */

	}

}
