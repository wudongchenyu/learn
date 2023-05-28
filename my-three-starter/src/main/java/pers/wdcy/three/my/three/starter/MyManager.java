package pers.wdcy.three.my.three.starter;

public class MyManager {
	
	private MystartProperties properties;
	
	public MyManager(MystartProperties properties) {
		this.properties = properties;
	}
	
	public void execute() {
		System.out.println(properties.isActive());
	}

}
