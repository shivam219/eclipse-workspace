import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class hii extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		String str = "<!DOCTYPE html>\r\n" + "<html lang=\"en\">\r\n" + "\r\n" + "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "        integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n" + "\r\n" + "<body>\r\n" + "\r\n"
				+ "    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n"
				+ "        <div class=\"container-fluid\">\r\n"
				+ "            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n"
				+ "                data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n"
				+ "                aria-label=\"Toggle navigation\">\r\n"
				+ "                <span class=\"navbar-toggler-icon\"></span>\r\n" + "            </button>\r\n"
				+ "            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "                    <li class=\"nav-item\">\r\n"
				+ "                        <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n"
				+ "                    </li>\r\n" + "                    <li class=\"nav-item\">\r\n"
				+ "                        <a class=\"nav-link\" href=\"#\">Link</a>\r\n"
				+ "                    </li>\r\n" + "                    <li class=\"nav-item dropdown\">\r\n"
				+ "                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\r\n"
				+ "                            data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n"
				+ "                            Dropdown\r\n" + "                        </a>\r\n"
				+ "                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n"
				+ "                            <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n"
				+ "                            <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n"
				+ "                            <li>\r\n"
				+ "                                <hr class=\"dropdown-divider\">\r\n"
				+ "                            </li>\r\n"
				+ "                            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n"
				+ "                        </ul>\r\n" + "                    </li>\r\n"
				+ "                    <li class=\"nav-item\">\r\n"
				+ "                        <a class=\"nav-link disabled\">Disabled</a>\r\n"
				+ "                    </li>\r\n" + "                </ul>\r\n"
				+ "                <form class=\"d-flex\">\r\n"
				+ "                    <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n"
				+ "                    <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n"
				+ "                </form>\r\n" + "            </div>\r\n" + "        </div>\r\n" + "    </nav>\r\n"
				+ "</body>\r\n" + "\r\n" + "</html>";

		PrintWriter pw = resp.getWriter();
		pw.write(str);
		pw.close();
	}
}
