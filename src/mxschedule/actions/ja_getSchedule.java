// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxschedule.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * returns kv of scheduled actions
 */
public class ja_getSchedule extends CustomJavaAction<java.util.List<IMendixObject>>
{
	public ja_getSchedule(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixObject> ret=new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixObject>();
		java.util.Iterator<java.util.Map.Entry<java.lang.String,org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler>> it=mxschedule.Schedule.hashmap.entrySet().iterator();
		while(it.hasNext()){
			java.util.Map.Entry<java.lang.String,org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler>pair=(java.util.Map.Entry<java.lang.String,org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler>)it.next();
			com.mendix.systemwideinterfaces.core.IMendixObject o=com.mendix.core.Core.instantiate(
				this.getContext(),
				"MxSchedule.KV"
			);
			try{
				o.setValue(this.getContext(),"K",pair.getKey());
				java.util.concurrent.ScheduledThreadPoolExecutor stpe=(java.util.concurrent.ScheduledThreadPoolExecutor)pair.getValue().getScheduledExecutor();
				com.google.gson.JsonObject jsonObject=new com.google.gson.JsonObject();
				jsonObject.addProperty("poolSize",stpe.getPoolSize());
				jsonObject.addProperty("completed",stpe.getCompletedTaskCount());
				jsonObject.addProperty("active",stpe.getActiveCount());
				jsonObject.addProperty("tasks",stpe.getTaskCount());
				o.setValue(this.getContext(),"V",jsonObject.toString());
			}catch(Exception e){
				com.mendix.core.Core.getLogger(this.toString()).error(e);
			}
			ret.add(o);
		}
		return ret;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ja_getSchedule";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
