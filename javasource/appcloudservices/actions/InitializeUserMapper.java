// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package appcloudservices.actions;

import appcloudservices.implementation.UserMapper;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class InitializeUserMapper extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String createAppCloudUserMicroflowName;
	private java.lang.String updateAppCloudUserMicroflowName;

	public InitializeUserMapper(IContext context, java.lang.String createAppCloudUserMicroflowName, java.lang.String updateAppCloudUserMicroflowName)
	{
		super(context);
		this.createAppCloudUserMicroflowName = createAppCloudUserMicroflowName;
		this.updateAppCloudUserMicroflowName = updateAppCloudUserMicroflowName;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        UserMapper.getInstance().initialize(this.createAppCloudUserMicroflowName, this.updateAppCloudUserMicroflowName);
        return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "InitializeUserMapper";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
