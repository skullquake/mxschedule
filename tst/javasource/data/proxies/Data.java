// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package data.proxies;

public class Data
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Data.Data";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public Data(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Data.Data"));
	}

	protected Data(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dataMendixObject)
	{
		if (dataMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Data.Data", dataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Data.Data");

		this.dataMendixObject = dataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Data.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static data.proxies.Data initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return data.proxies.Data.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static data.proxies.Data initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("Data.Vec1d", mendixObject.getType()))
			return data.proxies.Vec1d.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Data.Vec1f", mendixObject.getType()))
			return data.proxies.Vec1f.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Data.Vec1i", mendixObject.getType()))
			return data.proxies.Vec1i.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Data.Vec1s", mendixObject.getType()))
			return data.proxies.Vec1s.initialize(context, mendixObject);

		return new data.proxies.Data(context, mendixObject);
	}

	public static data.proxies.Data load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return data.proxies.Data.initialize(context, mendixObject);
	}

	public static java.util.List<? extends data.proxies.Data> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<data.proxies.Data> result = new java.util.ArrayList<data.proxies.Data>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Data.Data" + xpathConstraint))
			result.add(data.proxies.Data.initialize(context, obj));
		return result;
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
	 * @return value of idx
	 */
	public final java.lang.Integer getidx()
	{
		return getidx(getContext());
	}

	/**
	 * @param context
	 * @return value of idx
	 */
	public final java.lang.Integer getidx(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.idx.toString());
	}

	/**
	 * Set value of idx
	 * @param idx
	 */
	public final void setidx(java.lang.Integer idx)
	{
		setidx(getContext(), idx);
	}

	/**
	 * Set value of idx
	 * @param context
	 * @param idx
	 */
	public final void setidx(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer idx)
	{
		getMendixObject().setValue(context, MemberNames.idx.toString(), idx);
	}

	/**
	 * @return value of Data_Data_0
	 */
	public final data.proxies.Data getData_Data_0() throws com.mendix.core.CoreException
	{
		return getData_Data_0(getContext());
	}

	/**
	 * @param context
	 * @return value of Data_Data_0
	 */
	public final data.proxies.Data getData_Data_0(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		data.proxies.Data result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Data_Data_0.toString());
		if (identifier != null)
			result = data.proxies.Data.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Data_Data_0
	 * @param data_data_0
	 */
	public final void setData_Data_0(data.proxies.Data data_data_0)
	{
		setData_Data_0(getContext(), data_data_0);
	}

	/**
	 * Set value of Data_Data_0
	 * @param context
	 * @param data_data_0
	 */
	public final void setData_Data_0(com.mendix.systemwideinterfaces.core.IContext context, data.proxies.Data data_data_0)
	{
		if (data_data_0 == null)
			getMendixObject().setValue(context, MemberNames.Data_Data_0.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Data_Data_0.toString(), data_data_0.getMendixObject().getId());
	}

	/**
	 * @return value of Data_Data_1
	 */
	public final java.util.List<data.proxies.Data> getData_Data_1() throws com.mendix.core.CoreException
	{
		return getData_Data_1(getContext());
	}

	/**
	 * @param context
	 * @return value of Data_Data_1
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<data.proxies.Data> getData_Data_1(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<data.proxies.Data> result = new java.util.ArrayList<data.proxies.Data>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Data_Data_1.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(data.proxies.Data.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Data_Data_1
	 * @param data_data_1
	 */
	public final void setData_Data_1(java.util.List<data.proxies.Data> data_data_1)
	{
		setData_Data_1(getContext(), data_data_1);
	}

	/**
	 * Set value of Data_Data_1
	 * @param context
	 * @param data_data_1
	 */
	public final void setData_Data_1(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<data.proxies.Data> data_data_1)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (data.proxies.Data proxyObject : data_data_1)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Data_Data_1.toString(), identifiers);
	}

	/**
	 * @return value of Data_FileDocument_0
	 */
	public final data.proxies.FileDocument getData_FileDocument_0() throws com.mendix.core.CoreException
	{
		return getData_FileDocument_0(getContext());
	}

	/**
	 * @param context
	 * @return value of Data_FileDocument_0
	 */
	public final data.proxies.FileDocument getData_FileDocument_0(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		data.proxies.FileDocument result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Data_FileDocument_0.toString());
		if (identifier != null)
			result = data.proxies.FileDocument.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Data_FileDocument_0
	 * @param data_filedocument_0
	 */
	public final void setData_FileDocument_0(data.proxies.FileDocument data_filedocument_0)
	{
		setData_FileDocument_0(getContext(), data_filedocument_0);
	}

	/**
	 * Set value of Data_FileDocument_0
	 * @param context
	 * @param data_filedocument_0
	 */
	public final void setData_FileDocument_0(com.mendix.systemwideinterfaces.core.IContext context, data.proxies.FileDocument data_filedocument_0)
	{
		if (data_filedocument_0 == null)
			getMendixObject().setValue(context, MemberNames.Data_FileDocument_0.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Data_FileDocument_0.toString(), data_filedocument_0.getMendixObject().getId());
	}

	/**
	 * @return value of Data_FileDocument_1
	 */
	public final data.proxies.FileDocument getData_FileDocument_1() throws com.mendix.core.CoreException
	{
		return getData_FileDocument_1(getContext());
	}

	/**
	 * @param context
	 * @return value of Data_FileDocument_1
	 */
	public final data.proxies.FileDocument getData_FileDocument_1(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		data.proxies.FileDocument result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Data_FileDocument_1.toString());
		if (identifier != null)
			result = data.proxies.FileDocument.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Data_FileDocument_1
	 * @param data_filedocument_1
	 */
	public final void setData_FileDocument_1(data.proxies.FileDocument data_filedocument_1)
	{
		setData_FileDocument_1(getContext(), data_filedocument_1);
	}

	/**
	 * Set value of Data_FileDocument_1
	 * @param context
	 * @param data_filedocument_1
	 */
	public final void setData_FileDocument_1(com.mendix.systemwideinterfaces.core.IContext context, data.proxies.FileDocument data_filedocument_1)
	{
		if (data_filedocument_1 == null)
			getMendixObject().setValue(context, MemberNames.Data_FileDocument_1.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Data_FileDocument_1.toString(), data_filedocument_1.getMendixObject().getId());
	}

	/**
	 * @return value of Data_FileDocument_2
	 */
	public final java.util.List<data.proxies.FileDocument> getData_FileDocument_2() throws com.mendix.core.CoreException
	{
		return getData_FileDocument_2(getContext());
	}

	/**
	 * @param context
	 * @return value of Data_FileDocument_2
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<data.proxies.FileDocument> getData_FileDocument_2(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<data.proxies.FileDocument> result = new java.util.ArrayList<data.proxies.FileDocument>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Data_FileDocument_2.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(data.proxies.FileDocument.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Data_FileDocument_2
	 * @param data_filedocument_2
	 */
	public final void setData_FileDocument_2(java.util.List<data.proxies.FileDocument> data_filedocument_2)
	{
		setData_FileDocument_2(getContext(), data_filedocument_2);
	}

	/**
	 * Set value of Data_FileDocument_2
	 * @param context
	 * @param data_filedocument_2
	 */
	public final void setData_FileDocument_2(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<data.proxies.FileDocument> data_filedocument_2)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (data.proxies.FileDocument proxyObject : data_filedocument_2)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Data_FileDocument_2.toString(), identifiers);
	}

	/**
	 * @return value of FileDocument_Data_0
	 */
	public final data.proxies.FileDocument getFileDocument_Data_0() throws com.mendix.core.CoreException
	{
		return getFileDocument_Data_0(getContext());
	}

	/**
	 * @param context
	 * @return value of FileDocument_Data_0
	 */
	public final data.proxies.FileDocument getFileDocument_Data_0(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		data.proxies.FileDocument result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FileDocument_Data_0.toString());
		if (identifier != null)
			result = data.proxies.FileDocument.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FileDocument_Data_0
	 * @param filedocument_data_0
	 */
	public final void setFileDocument_Data_0(data.proxies.FileDocument filedocument_data_0)
	{
		setFileDocument_Data_0(getContext(), filedocument_data_0);
	}

	/**
	 * Set value of FileDocument_Data_0
	 * @param context
	 * @param filedocument_data_0
	 */
	public final void setFileDocument_Data_0(com.mendix.systemwideinterfaces.core.IContext context, data.proxies.FileDocument filedocument_data_0)
	{
		if (filedocument_data_0 == null)
			getMendixObject().setValue(context, MemberNames.FileDocument_Data_0.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FileDocument_Data_0.toString(), filedocument_data_0.getMendixObject().getId());
	}

	/**
	 * @return value of Data_Session
	 */
	public final system.proxies.Session getData_Session() throws com.mendix.core.CoreException
	{
		return getData_Session(getContext());
	}

	/**
	 * @param context
	 * @return value of Data_Session
	 */
	public final system.proxies.Session getData_Session(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Session result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Data_Session.toString());
		if (identifier != null)
			result = system.proxies.Session.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Data_Session
	 * @param data_session
	 */
	public final void setData_Session(system.proxies.Session data_session)
	{
		setData_Session(getContext(), data_session);
	}

	/**
	 * Set value of Data_Session
	 * @param context
	 * @param data_session
	 */
	public final void setData_Session(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Session data_session)
	{
		if (data_session == null)
			getMendixObject().setValue(context, MemberNames.Data_Session.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Data_Session.toString(), data_session.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dataMendixObject;
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
			final data.proxies.Data that = (data.proxies.Data) obj;
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
		return "Data.Data";
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
