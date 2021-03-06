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
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * https://redis.io/commands/georadius
 * 
 * Return the members of a sorted set populated with geospatial information using GEOADD, which are within the borders of the area specified with the center location and the maximum distance from the center (the radius).
 * The common use case for this command is to retrieve geospatial items near a specified point and no far than a given amount of meters (or other units). This allows, for example, to suggest mobile users of an application nearby places.
 * The radius is specified in one of the following units:
 * m for meters.
 * km for kilometers.
 * mi for miles.
 * ft for feet.
 */
public class GetNamesByRadius extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private String key;
	private java.math.BigDecimal longitude;
	private java.math.BigDecimal latitude;
	private java.math.BigDecimal radius;
	private redisconnector.proxies.Enum_GeoUnit unit;
	private Long max;

	public GetNamesByRadius(IContext context, String key, java.math.BigDecimal longitude, java.math.BigDecimal latitude, java.math.BigDecimal radius, String unit, Long max)
	{
		super(context);
		this.key = key;
		this.longitude = longitude;
		this.latitude = latitude;
		this.radius = radius;
		this.unit = unit == null ? null : redisconnector.proxies.Enum_GeoUnit.valueOf(unit);
		this.max = max;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		RedisConnector redisconnector = new RedisConnector(); 
		return redisconnector.georadius(this.getContext(), key, latitude.doubleValue(), longitude.doubleValue(), radius.doubleValue(), unit, max.intValue());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetNamesByRadius";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
