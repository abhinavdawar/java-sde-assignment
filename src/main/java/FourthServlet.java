import employeeAndEmployer.Employees;

@Component(service = Servlet.class, immediate = true, property = {
        "sling.servlet.paths=/bin/services/fourth", "sling.servlet.extensions=json"})
public class FourthServlet extends SlingSafeMethodsServlet{

    @Reference
    private transient Employees employees;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws IOException, ServletException {
        response.getWriter().write("Entry added successfully");
    }

    public void addMemberToPolicy() {
        employees.setCountry_code(+91);
        employees.setCreated_at(java.util.Calendar.getInstance().getTime());
        employees.setFull_name("Abhinav Dawar");
        employees.setEmp_id(4576);
        employees.setMerchant_id(1234);
        employees.setProduct_id(6578);
    }
}
