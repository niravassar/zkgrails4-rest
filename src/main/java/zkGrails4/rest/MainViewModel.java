package zkGrails4.rest;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
//import zkgrails4.rest.TestService;

import java.util.Date;

//@VariableResolver(DelegatingVariableResolver.class)
public class MainViewModel {

	//@WireVariable
	//protected TestService testService;

	@Command
	@NotifyChange("currentTime")
	public void updateTime() {
		//NOOP just for the notify change
	}

	public Date getCurrentTime() {
		return new Date();
	}
}
