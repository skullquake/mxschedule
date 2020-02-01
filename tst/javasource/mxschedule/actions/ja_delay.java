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
 * delay
 * for testing purposes (execution overlap behavior)
 */
public class ja_delay extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.Long int_ms;

	public ja_delay(IContext context, java.lang.Long int_ms)
	{
		super(context);
		this.int_ms = int_ms;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		java.lang.Thread.sleep(int_ms.longValue());
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ja_delay";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
