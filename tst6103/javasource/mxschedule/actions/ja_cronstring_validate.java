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
 * https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/scheduling/support/CronSequenceGenerator.html
 * 
 * org.springframework.scheduling.support.CronSequenceGenerator.
 * 
 * static boolean 	isValidExpression(String expression)
 * Determine whether the specified expression represents a valid cron pattern.
 * 
 */
public class ja_cronstring_validate extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String str_a;

	public ja_cronstring_validate(IContext context, java.lang.String str_a)
	{
		super(context);
		this.str_a = str_a;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return org.springframework.scheduling.support.CronSequenceGenerator.isValidExpression(str_a);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ja_cronstring_validate";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
