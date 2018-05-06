package com.itheima.dao;
import java.util.List;
import com.itheima.Util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import com.itheima.po.Customer;

public class CustomerDao {

	public void findCustomerByIdTest() throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		Customer customer = sqlSession.selectOne("com.itheima.mapper"
				  + ".CustomerMapper.findCustomerById", 1);
		System.out.println(customer.toString());
		sqlSession.close();
	}

	public void findCustomerByNameTest() throws Exception{
		SqlSession sqlSession = MybatisUtils.getSession();
	    List<Customer> customers = sqlSession.selectList("com.itheima.mapper"
					+ ".CustomerMapper.findCustomerByName", "j");
	    for (Customer customer : customers) {
	        System.out.println(customer);
	    }
	    // 5���ر�SqlSession
	    sqlSession.close();
	}
	
	/**
	 * ��ӿͻ�
	 */
	public void addCustomerTest(Customer customer) throws Exception{
		SqlSession sqlSession = MybatisUtils.getSession();
	    // 4��SqlSessionִ����Ӳ���
	    // 4.1����Customer���󣬲���������������
	    // 4.2ִ��SqlSession�Ĳ��뷽�������ص���SQL���Ӱ�������
		int rows = sqlSession.insert("com.itheima.mapper"
					+ ".CustomerMapper.addCustomer", customer);
	    // 4.3ͨ�����ؽ���жϲ�������Ƿ�ִ�гɹ�
	    if(rows > 0){
	        System.out.println("���ɹ�������"+rows+"�����ݣ�");
	    }else{
	        System.out.println("ִ�в������ʧ�ܣ�����");
	    }
	    // 4.4�ύ����
	    sqlSession.commit();
	    // 5���ر�SqlSession
	    sqlSession.close();
	}

	/**
	 * ���¿ͻ�
	 */
	public void updateCustomerTest() throws Exception{
		SqlSession sqlSession = MybatisUtils.getSession();
	    // 4��SqlSessionִ�и��²���
	    // 4.1����Customer���󣬶Զ����е����ݽ���ģ�����
	    Customer customer = new Customer();
	    customer.setId(2);
	    customer.setUsername("rose");
	    customer.setJobs("programmer");
	    customer.setPhone("13311111111");
	    // 4.2ִ��SqlSession�ĸ��·��������ص���SQL���Ӱ�������
	    int rows = sqlSession.update("com.itheima.mapper"
	            + ".CustomerMapper.updateCustomer", customer);
	    // 4.3ͨ�����ؽ���жϸ��²����Ƿ�ִ�гɹ�
	    if(rows > 0){
	        System.out.println("���ɹ��޸���"+rows+"�����ݣ�");
	    }else{
	        System.out.println("ִ���޸Ĳ���ʧ�ܣ�����");
	    }
	    // 4.4�ύ����
	    sqlSession.commit();
	    // 5���ر�SqlSession
	    sqlSession.close();
	}

	/**
	 * ɾ���ͻ�
	 */
	public void deleteCustomerTest(Customer id) throws Exception{
	    // 1����ȡ�����ļ�
		SqlSession sqlSession = MybatisUtils.getSession();
	    // 4��SqlSessionִ��ɾ������
	    // 4.1ִ��SqlSession��ɾ�����������ص���SQL���Ӱ�������
	    int rows = sqlSession.delete("com.itheima.mapper"
	            + ".CustomerMapper.deleteCustomer", id);
	    // 4.2ͨ�����ؽ���ж�ɾ�������Ƿ�ִ�гɹ�
	    if(rows > 0){
	        System.out.println("���ɹ�ɾ����"+rows+"�����ݣ�");
	    }else{
	        System.out.println("ִ��ɾ������ʧ�ܣ�����");
	    }
	    // 4.3�ύ����
	    sqlSession.commit();
	    // 5���ر�SqlSession
	    sqlSession.close();
	}

}
