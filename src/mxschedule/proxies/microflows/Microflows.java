// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxschedule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MxSchedule module
	public static java.util.List<mxutil.proxies.KV> ds_schedules(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.List<IMendixObject> objs = Core.execute(context, "MxSchedule.ds_schedules", params);
			java.util.List<mxutil.proxies.KV> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<mxutil.proxies.KV>();
				for (IMendixObject obj : objs)
					result.add(mxutil.proxies.KV.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_schedule_put(IContext context, java.lang.String _str_mf, java.lang.String _str_cron)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("str_mf", _str_mf);
			params.put("str_cron", _str_cron);
			Core.execute(context, "MxSchedule.ivk_schedule_put", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_schedule_shutdown(IContext context, mxutil.proxies.KV _obj_kv)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_kv", _obj_kv == null ? null : _obj_kv.getMendixObject());
			Core.execute(context, "MxSchedule.ivk_schedule_shutdown", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_schedule_shutdown_all(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxSchedule.ivk_schedule_shutdown_all", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_schedule_start(IContext context, mxschedule.proxies.Schedule _obj_schedule)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_schedule", _obj_schedule == null ? null : _obj_schedule.getMendixObject());
			Core.execute(context, "MxSchedule.ivk_schedule_start", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}