package ���ʵ����;

public class ListHome {
	IData iData;
	public ListHome(IData iData) {
		this.iData=iData;
	}
	public ListHome() {
		
	}
	public String search(int roomNo) {
		return iData.getStation(roomNo);
	}
}
