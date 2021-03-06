// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package data.proxies;

public class Vec1d extends data.proxies.Data
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Data.Vec1d";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public Vec1d(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Data.Vec1d"));
	}

	protected Vec1d(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vec1dMendixObject)
	{
		super(context, vec1dMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Data.Vec1d", vec1dMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Data.Vec1d");
	}

	/**
	 * @deprecated Use 'Vec1d.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static data.proxies.Vec1d initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return data.proxies.Vec1d.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static data.proxies.Vec1d initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("Data.Vec2d", mendixObject.getType()))
			return data.proxies.Vec2d.initialize(context, mendixObject);

		return new data.proxies.Vec1d(context, mendixObject);
	}

	public static data.proxies.Vec1d load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return data.proxies.Vec1d.initialize(context, mendixObject);
	}

	public static java.util.List<? extends data.proxies.Vec1d> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<data.proxies.Vec1d> result = new java.util.ArrayList<data.proxies.Vec1d>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Data.Vec1d" + xpathConstraint))
			result.add(data.proxies.Vec1d.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of _0
	 */
	public final java.util.Date get_0()
	{
		return get_0(getContext());
	}

	/**
	 * @param context
	 * @return value of _0
	 */
	public final java.util.Date get_0(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames._0.toString());
	}

	/**
	 * Set value of _0
	 * @param _0
	 */
	public final void set_0(java.util.Date _0)
	{
		set_0(getContext(), _0);
	}

	/**
	 * Set value of _0
	 * @param context
	 * @param _0
	 */
	public final void set_0(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date _0)
	{
		getMendixObject().setValue(context, MemberNames._0.toString(), _0);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final data.proxies.Vec1d that = (data.proxies.Vec1d) obj;
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
		return "Data.Vec1d";
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
