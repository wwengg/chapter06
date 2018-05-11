package com.itheima.controller;

import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class CustomerController {
    @RequestMapping(value = "/doAdd")
    public String doAdd(Customer customer)throws Exception{
        CustomerDao AddCustmertest = new CustomerDao();
        AddCustmertest.addCustomerTest(customer);
        return "/success.jsp";
    }

    @RequestMapping(value = "/doDel")
    public String doDel(Customer id)throws Exception {
        CustomerDao Delete = new CustomerDao();
        Delete.deleteCustomerTest(id);
        return "/success.jsp";
    }
    @RequestMapping(value = "/doUpdate")
    public String doUpdate(Customer customer)throws Exception{
        CustomerDao UpdateCustomerTest = new CustomerDao();
        UpdateCustomerTest.updateCustomerTest(customer);
        return "/success.jsp";
    }
    //查询通过ID
    @RequestMapping(value = "/doFindId")
    public String doFindId(Integer id,Model model)throws Exception {
        CustomerDao Id = new CustomerDao();
        Customer customer = Id.findCustomerByIdTest(id);
        model.addAttribute("c",customer);
        return "/result.jsp";
    }
    //查询通过用户名
    @RequestMapping(value = "/doFindName")
    public String doFindName(String username,Model model)throws Exception {
        CustomerDao my = new CustomerDao();
       List<Customer> customers = my.findCustomerByNameTest(username);

        model.addAttribute("cs",customers);
        return "/resultname.jsp";

    }
}
