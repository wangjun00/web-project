package DuiXiang;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestAd {

	public static void main(String[] args) {
		Administrator namer1 = new Administrator();
		namer1.name = "张三";
		namer1.password = "123456";
		System.out.println("姓名：" + namer1.name);
		System.out.println("账号：" + namer1.password);

		Administrator namer2 = new Administrator();
		namer2.name = "莉莉";
		namer2.password = "199586";
		System.out.println("姓名：" + namer2.name);
		System.out.println("账号：" + namer2.password);
		namer1.show();
		namer2.show();
		Customer ctr =new Customer();
		ctr.score=80;
		ctr.cardType="VIP";
		ctr.show();
	
	
	}

}
