package system;

import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.mendix.core.Core;
import com.mendix.core.component.LocalComponent;
import com.mendix.core.component.MxRuntime;
import com.mendix.integration.Integration;

@Component(immediate = true, properties = {"event.topics:String=com/mendix/events/model/loaded"})
public class UserActionsRegistrar implements EventHandler
{
	private MxRuntime mxRuntime;
	private LocalComponent component;
	private Integration integration;
	
	@Reference
	public void setMxRuntime(MxRuntime runtime)
	{
		mxRuntime = runtime;
		mxRuntime.bundleComponentLoaded();
	}
	
	@Reference
	public void setIntegration(Integration integration)
	{
		this.integration = integration;
	}
	
	@Override
	public void handleEvent(Event event)
	{
		if (event.getTopic().equals(com.mendix.core.event.EventConstants.ModelLoadedTopic()))        
		{
			component = mxRuntime.getMainComponent();
			Core.initialize(component, integration);   
			component.actionRegistry().registerUserAction(mxmodelreflection.actions.ReplaceToken.class);
			component.actionRegistry().registerUserAction(mxmodelreflection.actions.SyncObjects.class);
			component.actionRegistry().registerUserAction(mxmodelreflection.actions.TestThePattern.class);
			component.actionRegistry().registerUserAction(mxmodelreflection.actions.ValidateTokensInMessage.class);
			component.actionRegistry().registerUserAction(mxschedule.actions.ja_cronstring_validate.class);
			component.actionRegistry().registerUserAction(mxschedule.actions.ja_delay.class);
			component.actionRegistry().registerUserAction(mxschedule.actions.ja_deleteSchedule.class);
			component.actionRegistry().registerUserAction(mxschedule.actions.ja_getSchedule.class);
			component.actionRegistry().registerUserAction(mxschedule.actions.ja_nashorn_exec.class);
			component.actionRegistry().registerUserAction(mxschedule.actions.ja_putSchedule_mf_cron.class);
			component.actionRegistry().registerUserAction(mxschedule.actions.ja_putSchedule_mf_ms.class);
			component.actionRegistry().registerUserAction(mxschedule.actions.ja_putSchedule_nh_cron.class);
			component.actionRegistry().registerUserAction(mxschedule.actions.ja_putSchedule_nh_ms.class);
			component.actionRegistry().registerUserAction(system.actions.VerifyPassword.class);
		}
	}
}