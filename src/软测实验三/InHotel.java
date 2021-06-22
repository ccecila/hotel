package »Ì≤‚ µ—È»˝;

public class InHotel {
	IData iData;
	public InHotel(IData iData) {
		this.iData=iData;
	}
	public InHotel() {
		
	}
	public String in(int roomNo,String name) {
		return iData.in_out_Room(roomNo, name);
	}
}
