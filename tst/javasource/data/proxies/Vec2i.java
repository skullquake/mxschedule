// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package data.proxies;

public class Vec2i extends data.proxies.Vec1i
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Data.Vec2i";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public Vec2i(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Data.Vec2i"));
	}

	protected Vec2i(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vec2iMendixObject)
	{
		super(context, vec2iMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Data.Vec2i", vec2iMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Data.Vec2i");
	}

	/**
	 * @deprecated Use 'Vec2i.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static data.proxies.Vec2i initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return data.proxies.Vec2i.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static data.proxies.Vec2i initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("Data.Vec3i", mendixObject.getType()))
			return data.proxies.Vec3i.initialize(context, mendixObject);

		return new data.proxies.Vec2i(context, mendixObject);
	}

	public static data.proxies.Vec2i load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return data.proxies.Vec2i.initialize(context, mendixObject);
	}

	public static java.util.List<? extends data.proxies.Vec2i> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<data.proxies.Vec2i> result = new java.util.ArrayList<data.proxies.Vec2i>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Data.Vec2i" + xpathConstraint))
			result.add(data.proxies.Vec2i.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of _1
	 */
	public final java.lang.Integer get_1()
	{
		return get_1(getContext());
	}

	/**
	 * @param context
	 * @return value of _1
	 */
	public final java.lang.Integer get_1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames._1.toString());
	}

	/**
	 * Set value of _1
	 * @param _1
	 */
	public final void set_1(java.lang.Integer _1)
	{
		set_1(getContext(), _1);
	}

	/**
	 * Set value of _1
	 * @param context
	 * @param _1
	 */
	public final void set_1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer _1)
	{
		getMendixObject().setValue(context, MemberNames._1.toString(), _1);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final data.proxies.Vec2i that = (data.proxies.Vec2i) obj;
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
		return "Data.Vec2i";
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
