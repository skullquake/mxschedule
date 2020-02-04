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

/**
 * Nashorn Script to execute
 */
public class ja_nashorn_exec extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String str_script;

	public ja_nashorn_exec(IContext context, java.lang.String str_script)
	{
		super(context);
		this.str_script = str_script;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		javax.script.ScriptEngine engine=new javax.script.ScriptEngineManager().getEngineByName("nashorn");
		javax.script.Bindings bindings=engine.createBindings();
		bindings.put("root", this);
		engine.eval(str_script,bindings);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ja_nashorn_exec";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}