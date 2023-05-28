package pers.wdcy.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import pers.wdcy.mystart.MyManager;

@Component
public class MyStarter implements CommandLineRunner{

	private @Autowired MyManager manager;
	
	@Override
	public void run(String... args) throws Exception {
		manager.execute();
	}

}
