package ���ʵ����;

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
		//��Mockeryʵ��������һ��ģ���IData����
		iData=context.mock(IData.class);
		ih=new InHotel(iData);
		context.checking(new Expectations() {{
			oneOf(iData).in_out_Room(301,"cecilia");
			will(returnValue("cecilia�ɹ���ס301���䣡"));
			
			
		}});
	}
	
	@Test
	public void testIn() {	
		assertEquals("cecilia�ɹ���ס301���䣡",ih.in(301, "cecilia"));
		

	}

}
