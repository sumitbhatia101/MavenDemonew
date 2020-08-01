package demointegration;

import org.testng.Assert;
import org.testng.annotations.Test;
public class INtegration {
	


		
		@Test
		public void sum() {
			int a = 10;
			int b=20;
			Assert.assertEquals(330, a+b);
		}

		@Test
		public void substract() {
			int a = 10;
			int b=20;
			Assert.assertEquals(-10, a-b);
		}
		
		@Test
		public void div() {
			int a = 10;
			int b=20;
			Assert.assertEquals(2, b/a);
		}
		@Test
		public void dive() {
			int a = 15;
			int b=15;
			Assert.assertEquals(1, b/a);
		}
		
		@Test
		public void multi() {
			int a = 10;
			int b=20;
			Assert.assertEquals(200, a*b);
		}
		
		
		@Test
		public void multi2() {
			int a = 10;
			int b=30;
			Assert.assertEquals(300, a*b);
		}

		@Test
		public void multi3() {
			int a = 10;
			int b=3400;
			Assert.assertEquals(34000, a*b);

		}	
		
			@Test
			public void multi4() {
				int a = 10;
				int b=301;
				Assert.assertEquals(3010, a*b);
		}
	}





