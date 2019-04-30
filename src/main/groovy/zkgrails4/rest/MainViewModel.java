package zkgrails4.rest;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import java.util.Date;

@VariableResolver(DelegatingVariableResolver.class)
public class MainViewModel {

    @WireVariable
	TestService testService;

	@Command
	@NotifyChange("currentTime")
	public void updateTime() {
		//NOOP just for the notify change
	}

	public Date getCurrentTime() {
		return testService.getTime();
	}
}
