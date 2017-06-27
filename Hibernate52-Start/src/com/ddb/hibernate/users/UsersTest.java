package com.ddb.hibernate.users;


import java.util.List;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class UsersTest {
	private static Logger logger=Logger.getLogger(UsersTest.class);
	
	private Session session=null;
	private SessionFactory sessionFactory=null;
	
	/**
	 * �@ȡsession
	 * @return
	 * */                      
	public Session getSession() {
		System.out.println("�ӻỰ������ȡsession");
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		return session;

	}

	/**
	 *�P�]session 
	 * **/
	public void closeSession(){
		if(session != null)
			session.close();
		if(sessionFactory !=null)
			sessionFactory.close();
		System.out.println("�رջػ������ˣ�");
	}
	/**
	 * ���딵��
	 * @param users
	 * @return
	 * */
	public Long insert(Users users){
		session=getSession();
		System.out.println("��ȡ�ػ���insert");
		Transaction transaction=session.beginTransaction();//�_ʼ����
		System.out.println("��ʼ������");
		Long id=(Long) session.save(users);//�����
		System.out.println("�����");
		transaction.commit();
		System.out.println("�ύ����");
		closeSession();
		return id;
	}
	
	/**
	 * ������
	 * @param users
	 * */
	public void update(Users users){
		session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(users);
		System.out.println("��������");
		transaction.commit();
		closeSession();
		
	}
	/**
	 * �h���픵��
	 * @param users
	 * 
	 * */
	public void delete(Users users){
		session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(users);
		transaction.commit();
		closeSession();
	}
	/**
	 * �@ȡһ�l����
	 * @param ID
	 * @return
	 * */
	public Users getUsersById(Long id){
		session=getSession();
		Users users=(Users) session.get(Users.class, id);
		System.out.println("��ȡID");
		closeSession();
		return users;
	}
	/**
	 * �@ȡ�б�
	 * 
	 * @return
	 * */
	@SuppressWarnings("unchecked")
	public List<Users> getUsersList(){
		session=getSession();
		//List<Users> usersList=(List<Users>)session.createQuery("from 
		//Users").List(); �f��ķ�����
		
		List<Users> usersList=(List<Users>)session.createQuery("from Users").getResultList();
		closeSession();
		System.out.println("��ȡ������");
		return usersList;
		
	}
	public static void main(String[] args) {
		UsersTest test=new UsersTest();
		Long userId=test.insert(new Users(null, "jack11","jack11"));
		System.out.println("����jack11����");
		logger.info(userId);
		//logger.info(test.getUsersById(userId));
		
		//test.update(new Users(6L, "tom11", "tom11"));
		
		//Users users=new Users();
		//users.setId(6L);
		//test.delete(users);
		
		//logger.info(test.getUserById(5L));
		
		//List<Users> usersList=test.getUsersList();
		//for(Users user1: usersList){
		//	logger.info(user1);
			  
	//	}
		
		
		
	}
	
	
	
	
	
	
}
