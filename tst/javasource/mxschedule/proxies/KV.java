// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxschedule.proxies;

/**
 * Static mxschedule.Schedule hashmap access
 */
public class KV
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject kVMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxSchedule.KV";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		K("K"),
		V("V");

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

	public KV(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxSchedule.KV"));
	}

	protected KV(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject kVMendixObject)
	{
		if (kVMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxSchedule.KV", kVMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxSchedule.KV");

		this.kVMendixObject = kVMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'KV.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxschedule.proxies.KV initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxschedule.proxies.KV.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxschedule.proxies.KV initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxschedule.proxies.KV(context, mendixObject);
	}

	public static mxschedule.proxies.KV load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxschedule.proxies.KV.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of K
	 */
	public final java.lang.String getK()
	{
		return getK(getContext());
	}

	/**
	 * @param context
	 * @return value of K
	 */
	public final java.lang.String getK(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.K.toString());
	}

	/**
	 * Set value of K
	 * @param k
	 */
	public final void setK(java.lang.String k)
	{
		setK(getContext(), k);
	}

	/**
	 * Set value of K
	 * @param context
	 * @param k
	 */
	public final void setK(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String k)
	{
		getMendixObject().setValue(context, MemberNames.K.toString(), k);
	}

	/**
	 * @return value of V
	 */
	public final java.lang.String getV()
	{
		return getV(getContext());
	}

	/**
	 * @param context
	 * @return value of V
	 */
	public final java.lang.String getV(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.V.toString());
	}

	/**
	 * Set value of V
	 * @param v
	 */
	public final void setV(java.lang.String v)
	{
		setV(getContext(), v);
	}

	/**
	 * Set value of V
	 * @param context
	 * @param v
	 */
	public final void setV(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String v)
	{
		getMendixObject().setValue(context, MemberNames.V.toString(), v);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return kVMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxschedule.proxies.KV that = (mxschedule.proxies.KV) obj;
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
		return "MxSchedule.KV";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
