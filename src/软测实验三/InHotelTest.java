package 软测实验三;

import static org.junit.Assert.assertEquals;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InHotelTest {
	private Mockery context=new Mockery();
	private IData iData=null;
	private InHotel ih=null;
	
	@BeforeEach
	public void setUp() throws Exception{
		//用Mockery实例来构造一个模拟的IData对象
		iData=context.mock(IData.class);
		ih=new InHotel(iData);
		context.checking(new Expectations() {{
			oneOf(iData).in_out_Room(301,"cecilia");
			will(returnValue("cecilia成功入住301房间！"));
			
			
		}});
	}
	
	@Test
	public void testIn() {	
		assertEquals("cecilia成功入住301房间！",ih.in(301, "cecilia"));
		

	}

}
