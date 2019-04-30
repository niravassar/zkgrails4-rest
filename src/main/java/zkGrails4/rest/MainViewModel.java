package zkGrails4.rest;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
//import org.zkoss.zkplus.spring.DelegatingVariableResolver;
//import zkgrails4.rest.TestService;

import java.util.Date;

//@VariableResolver(DelegatingVariableResolver.class)
public class MainViewModel {

	//@WireVariable
	//public TestService testService;

	@Init
	public void init() {
//		pages.put("page1", new PageModel<>("~./zul/mvvm-page1.zul", "some data for page 1 (could be a more complex object)"));
//		pages.put("page2", new PageModel<>("~./zul/mvvm-page2.zul", "different data for page 2"));
	}

	@Command
	@NotifyChange("currentTime")
	public void updateTime() {
		//NOOP just for the notify change
	}

	public Date getCurrentTime() {
		return new Date();
	}
}
