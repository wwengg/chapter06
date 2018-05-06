package com.itheima.controller;

import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @RequestMapping(value = "/doAdd")
    public String doAdd(Customer customer)throws Exception{
        CustomerDao AddCustmertest = new CustomerDao();
        AddCustmertest.addCustomerTest(customer);
        return "/index.jsp";
    }

    @RequestMapping(value = "/doDel")
    public String doDel(Customer id)throws Exception {
        CustomerDao Delete = new CustomerDao();
        Delete.deleteCustomerTest(id);
        return "/success.jsp";
    }

}
