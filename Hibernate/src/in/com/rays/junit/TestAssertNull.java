package in.com.rays.junit;

import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

public class TestAssertNull extends TestCase{
	
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(11);

		//assertNull("user is null", bean);
		 assertTrue(bean == null);

	}


}
