// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package redisconnector.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import redisconnector.impl.RedisConnector;

/**
 * EXISTS key [key ...]
 * 
 * Available since 1.0.0.
 * Time complexity: O(1)
 * Returns if key exists.
 * Since Redis 3.0.3 it is possible to specify multiple keys instead of a single one. In such a case, it returns the total number of keys existing. Note that returning 1 or 0 for a single key is just a special case of the variadic usage, so the command is completely backward compatible.
 * The user should be aware that if the same existing key is mentioned in the arguments multiple times, it will be counted multiple times. So if somekey exists, EXISTS somekey somekey will return 2.
 * Return value
 * Integer reply, specifically:
 * 1 if the key exists.
 * 0 if the key does not exist.
 * Since Redis 3.0.3 the command accepts a variable number of keys and the return value is generalized:
 * The number of keys existing among the ones specified as arguments. Keys mentioned multiple times and existing are counted multiple times.
 * Examples
 * redis> SET key1 "Hello"
 * "OK"
 * redis> EXISTS key1
 * (integer) 1
 * redis> EXISTS nosuchkey
 * (integer) 0
 * redis> SET key2 "World"
 * "OK"
 * redis> EXISTS key1 key2 nosuchkey
 * (integer) 2
 * redis>
 */
public class Exists extends CustomJavaAction<Boolean>
{
	private String key;

	public Exists(IContext context, String key)
	{
		super(context);
		this.key = key;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		RedisConnector redisconnector = new RedisConnector(); 
		return redisconnector.exists(key);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "Exists";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
