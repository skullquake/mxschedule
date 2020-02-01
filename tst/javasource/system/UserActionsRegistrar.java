package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(mxmodelreflection.actions.ReplaceToken.class);
    registrator.registerUserAction(mxmodelreflection.actions.SyncObjects.class);
    registrator.registerUserAction(mxmodelreflection.actions.TestThePattern.class);
    registrator.registerUserAction(mxmodelreflection.actions.ValidateTokensInMessage.class);
    registrator.registerUserAction(mxschedule.actions.ja_cronstring_validate.class);
    registrator.registerUserAction(mxschedule.actions.ja_delay.class);
    registrator.registerUserAction(mxschedule.actions.ja_deleteSchedule.class);
    registrator.registerUserAction(mxschedule.actions.ja_getSchedule.class);
    registrator.registerUserAction(mxschedule.actions.ja_nashorn_exec.class);
    registrator.registerUserAction(mxschedule.actions.ja_putSchedule_mf_cron.class);
    registrator.registerUserAction(mxschedule.actions.ja_putSchedule_mf_ms.class);
    registrator.registerUserAction(mxschedule.actions.ja_putSchedule_nh_cron.class);
    registrator.registerUserAction(mxschedule.actions.ja_putSchedule_nh_ms.class);
    registrator.registerUserAction(mxschedule.actions.ja_updateSchedule.class);
    registrator.registerUserAction(splitstringutility.actions.SplitString.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
