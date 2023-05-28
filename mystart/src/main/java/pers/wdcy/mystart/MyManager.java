package pers.wdcy.mystart;

public class MyManager {
	
	private MystartProperties properties;
	
	public MyManager(MystartProperties properties) {
		this.properties = properties;
	}
	
	public void execute() {
		System.out.println(properties.isActive());
	}

}
