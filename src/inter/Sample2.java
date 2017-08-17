package inter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

public class Sample2 extends AbstractInterceptor
{
    public String intercept(ActionInvocation actionInvocation) throws Exception 
    {
        ActionContext ctx = ActionContext.getContext();
        HttpServletRequest req = (HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);
        String s = req.getParameter("roll");
        int x = Integer.parseInt(s);
        if(x % 2 == 0)
            return "error2";
        
        String str = actionInvocation.invoke();
        return str;
    }
}