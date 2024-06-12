package in.com.rays.junit;

import static org.junit.Assert.assertNotNull;

import junit.framework.TestCase;

public class TestAssertNotNull extends TestCase{
	
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(90);

		assertNotNull("user not null", bean);

	}



}
