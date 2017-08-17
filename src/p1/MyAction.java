package p1;

import com.opensymphony.xwork2.Action;

public class MyAction implements Action
{    
    public String execute() throws Exception 
    {        
        System.out.println("Action Invoked");
        return SUCCESS;
    }
}