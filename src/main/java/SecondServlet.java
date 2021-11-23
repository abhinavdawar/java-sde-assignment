import employeeAndEmployer.Employer;

import java.util.HashMap;
import java.util.Map;

@Component(service = Servlet.class, immediate = true, property = {
        "sling.servlet.paths=/bin/services/second", "sling.servlet.extensions=json"})
public class SecondServlet extends SlingSafeMethodsServlet{

    @Reference
    private transient Employer employer;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws IOException, ServletException {
        response.getWriter().write(policiesMatchedToCorporates());
    }

    public void policiesMatchedToCorporates() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(employer.getMerchant_id(), employer.getProduct_id());
        for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }
    }
}
