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
	 * 獲取session
	 * @return
	 * */
	public Session getSession(){
		sessionFactory=new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		
		return session;
	}	
	/**
	 *關閉session 
	 * **/
	public void closeSession(){
		if(session != null)
			session.close();
		if(sessionFactory !=null)
			sessionFactory.close();
		
	}
	/**
	 * 插入數據
	 * @param users
	 * @return
	 * */
	public Long insert(Users users){
		session=getSession();
		Transaction transaction=session.beginTransaction();//開始事物
		Long id=(Long) session.save(users);//保存表
		transaction.commit();
		closeSession();
		return id;
	}
	
	/**
	 * 更新數據
	 * @param users
	 * */
	public void update(Users users){
		session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(users);
		transaction.commit();
		closeSession();
		
	}
	/**
	 * 刪除表數據
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
	 * 獲取一條數據
	 * @param ID
	 * @return
	 * */
	public Users getUsersById(Long id){
		session=getSession();
		Users users=(Users) session.get(Users.class, id);
		closeSession();
		return users;
	}
	/**
	 * 獲取列表
	 * 
	 * @return
	 * */
	@SuppressWarnings("unchecked")
	public List<Users> getUsersList(){
		session=getSession();
		//List<Users> usersList=(List<Users>)session.createQuery("from 
		//Users").List(); 舊版的方法！
		
		List<Users> usersList=(List<Users>)session.createQuery("from Users").getResultList();
		closeSession();
		return usersList;
		
	}
	public static void main(String[] args) {
		UsersTest test=new UsersTest();
		Long userId=test.insert(new Users(null, "jack11","jack11"));
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
