package com.itheima.dao;
import java.util.List;
import com.itheima.Util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import com.itheima.po.Customer;
import org.springframework.ui.Model;

public class CustomerDao {

	public Customer findCustomerByIdTest(Integer id) throws Exception {
	    SqlSession sqlSession = MybatisUtils.getSession();
		Customer customer = sqlSession.selectOne("com.itheima.mapper"
				  + ".CustomerMapper.findCustomerById", id);
		System.out.println(customer);
		sqlSession.close();
		return customer;


	}

	public List<Customer> findCustomerByNameTest(String username) throws Exception{
	    SqlSession sqlSession = MybatisUtils.getSession();
	    List<Customer> customers = sqlSession.selectList("com.itheima.mapper"
					+ ".CustomerMapper.findCustomerByName", username);
	    for (Customer customer : customers) {
	        System.out.println(customer);
	    }

	    // 5、关闭SqlSession
	    sqlSession.close();
	    return customers;

	}
	
	/**
	 * 添加客户
	 */
	public void addCustomerTest(Customer customer) throws Exception{
		SqlSession sqlSession = MybatisUtils.getSession();
	    // 4、SqlSession执行添加操作
	    // 4.1创建Customer对象，并向对象中添加数据
	    // 4.2执行SqlSession的插入方法，返回的是SQL语句影响的行数
		int rows = sqlSession.insert("com.itheima.mapper"
					+ ".CustomerMapper.addCustomer", customer);
	    // 4.3通过返回结果判断插入操作是否执行成功
		System.out.println(customer.getId());
	    if(rows > 0){
	        System.out.println("您成功插入了"+rows+"条数据！");
	    }else{
	        System.out.println("执行插入操作失败！！！");
	    }
	    // 4.4提交事务
	    sqlSession.commit();
	    // 5、关闭SqlSession
	    sqlSession.close();
	}

	/**
	 * 更新客户
	 */
	public void updateCustomerTest(Customer customer) throws Exception{
		SqlSession sqlSession = MybatisUtils.getSession();
	    // 4、SqlSession执行更新操作
	    // 4.1创建Customer对象，对对象中的数据进行模拟更新
	    // 4.2执行SqlSession的更新方法，返回的是SQL语句影响的行数
	    int rows = sqlSession.update("com.itheima.mapper"
	            + ".CustomerMapper.updateCustomer", customer);
	    // 4.3通过返回结果判断更新操作是否执行成功
	    if(rows > 0){
	        System.out.println("您成功修改了"+rows+"条数据！");
	    }else{
	        System.out.println("执行修改操作失败！！！");
	    }
	    // 4.4提交事务
	    sqlSession.commit();
	    // 5、关闭SqlSession
	    sqlSession.close();
	}

	/**
	 * 删除客户
	 */
	public void deleteCustomerTest(Customer id) throws Exception{
	    // 1、读取配置文件
		SqlSession sqlSession = MybatisUtils.getSession();
	    // 4、SqlSession执行删除操作
	    // 4.1执行SqlSession的删除方法，返回的是SQL语句影响的行数
	    int rows = sqlSession.delete("com.itheima.mapper"
	            + ".CustomerMapper.deleteCustomer", id);
	    // 4.2通过返回结果判断删除操作是否执行成功
	    if(rows > 0){
	        System.out.println("您成功删除了"+rows+"条数据！");
	    }else{
	        System.out.println("执行删除操作失败！！！");
	    }
	    // 4.3提交事务
	    sqlSession.commit();
	    // 5、关闭SqlSession
	    sqlSession.close();
	}

}
