import employeeAndEmployer.Employees;

import java.util.HashMap;
import java.util.Map;

@Component(service = Servlet.class, immediate = true, property = {
        "sling.servlet.paths=/bin/services/third", "sling.servlet.extensions=json"})
public class ThirdServlet extends SlingSafeMethodsServlet{

    @Reference
    private transient Employees employees;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws IOException, ServletException {
        response.getWriter().write(membersMatchedToPolicy());
    }
    public void membersMatchedToPolicy() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(employees.getEmp_id(), employees.getProduct_id());
        for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }
    }
}
