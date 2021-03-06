// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package data.proxies;

public class Vec4d extends data.proxies.Vec3d
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Data.Vec4d";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_3("_3"),
		_2("_2"),
		_1("_1"),
		_0("_0"),
		idx("idx"),
		Data_Data_0("Data.Data_Data_0"),
		Data_Data_1("Data.Data_Data_1"),
		Data_FileDocument_0("Data.Data_FileDocument_0"),
		Data_FileDocument_1("Data.Data_FileDocument_1"),
		Data_FileDocument_2("Data.Data_FileDocument_2"),
		FileDocument_Data_0("Data.FileDocument_Data_0"),
		Data_Session("Data.Data_Session");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Vec4d(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Data.Vec4d"));
	}

	protected Vec4d(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vec4dMendixObject)
	{
		super(context, vec4dMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Data.Vec4d", vec4dMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Data.Vec4d");
	}

	/**
	 * @deprecated Use 'Vec4d.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static data.proxies.Vec4d initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return data.proxies.Vec4d.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static data.proxies.Vec4d initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new data.proxies.Vec4d(context, mendixObject);
	}

	public static data.proxies.Vec4d load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return data.proxies.Vec4d.initialize(context, mendixObject);
	}

	public static java.util.List<data.proxies.Vec4d> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<data.proxies.Vec4d> result = new java.util.ArrayList<data.proxies.Vec4d>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Data.Vec4d" + xpathConstraint))
			result.add(data.proxies.Vec4d.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of _3
	 */
	public final java.util.Date get_3()
	{
		return get_3(getContext());
	}

	/**
	 * @param context
	 * @return value of _3
	 */
	public final java.util.Date get_3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames._3.toString());
	}

	/**
	 * Set value of _3
	 * @param _3
	 */
	public final void set_3(java.util.Date _3)
	{
		set_3(getContext(), _3);
	}

	/**
	 * Set value of _3
	 * @param context
	 * @param _3
	 */
	public final void set_3(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date _3)
	{
		getMendixObject().setValue(context, MemberNames._3.toString(), _3);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final data.proxies.Vec4d that = (data.proxies.Vec4d) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Data.Vec4d";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
