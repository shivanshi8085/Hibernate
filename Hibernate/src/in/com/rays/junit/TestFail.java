package in.com.rays.junit;

import static org.junit.Assert.fail;

public class TestFail {
	
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(11);
		bean.setName("abc");
		bean.setSalary(6000);

		UserModel.add(bean);
		
		bean = UserModel.findByPk(12);

		if (bean == null) {

			fail("Record is not added...!!!");

		} else {
			System.out.println("record is added..!!!");
		}

	}

}
