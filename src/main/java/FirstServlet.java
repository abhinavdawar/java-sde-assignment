import com.google.gson.Gson;
import employeeAndEmployer.Corporate;
import jdk.nashorn.internal.ir.annotations.Reference;

@Component(service = Servlet.class, immediate = true, property = {
        "sling.servlet.paths=/bin/services/first", "sling.servlet.extensions=json"})
public class FirstServlet extends SlingSafeMethodsServlet{

    @Reference
    private transient Corporate corporate;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws IOException, ServletException {
        response.getWriter().write(fetchTotalCorporates());
    }

    public int fetchTotalCorporates() {
        return corporate.getTotalCount();
    }
}
