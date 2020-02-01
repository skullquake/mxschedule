// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package data.proxies;

public class FileDocument extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Data.FileDocument";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		Data_FileDocument_0("Data.Data_FileDocument_0"),
		FileDocument_Data_0("Data.FileDocument_Data_0"),
		FileDocument_Data_1("Data.FileDocument_Data_1"),
		FileDocument_Data_2("Data.FileDocument_Data_2");

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

	public FileDocument(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Data.FileDocument"));
	}

	protected FileDocument(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fileDocumentMendixObject)
	{
		super(context, fileDocumentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Data.FileDocument", fileDocumentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Data.FileDocument");
	}

	/**
	 * @deprecated Use 'FileDocument.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static data.proxies.FileDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return data.proxies.FileDocument.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static data.proxies.FileDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new data.proxies.FileDocument(context, mendixObject);
	}

	public static data.proxies.FileDocument load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return data.proxies.FileDocument.initialize(context, mendixObject);
	}

	public static java.util.List<data.proxies.FileDocument> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<data.proxies.FileDocument> result = new java.util.ArrayList<data.proxies.FileDocument>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Data.FileDocument" + xpathConstraint))
			result.add(data.proxies.FileDocument.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Data_FileDocument_0
	 */
	public final data.proxies.Data getData_FileDocument_0() throws com.mendix.core.CoreException
	{
		return getData_FileDocument_0(getContext());
	}

	/**
	 * @param context
	 * @return value of Data_FileDocument_0
	 */
	public final data.proxies.Data getData_FileDocument_0(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		data.proxies.Data result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Data_FileDocument_0.toString());
		if (identifier != null)
			result = data.proxies.Data.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Data_FileDocument_0
	 * @param data_filedocument_0
	 */
	public final void setData_FileDocument_0(data.proxies.Data data_filedocument_0)
	{
		setData_FileDocument_0(getContext(), data_filedocument_0);
	}

	/**
	 * Set value of Data_FileDocument_0
	 * @param context
	 * @param data_filedocument_0
	 */
	public final void setData_FileDocument_0(com.mendix.systemwideinterfaces.core.IContext context, data.proxies.Data data_filedocument_0)
	{
		if (data_filedocument_0 == null)
			getMendixObject().setValue(context, MemberNames.Data_FileDocument_0.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Data_FileDocument_0.toString(), data_filedocument_0.getMendixObject().getId());
	}

	/**
	 * @return value of FileDocument_Data_0
	 */
	public final data.proxies.Data getFileDocument_Data_0() throws com.mendix.core.CoreException
	{
		return getFileDocument_Data_0(getContext());
	}

	/**
	 * @param context
	 * @return value of FileDocument_Data_0
	 */
	public final data.proxies.Data getFileDocument_Data_0(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		data.proxies.Data result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FileDocument_Data_0.toString());
		if (identifier != null)
			result = data.proxies.Data.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FileDocument_Data_0
	 * @param filedocument_data_0
	 */
	public final void setFileDocument_Data_0(data.proxies.Data filedocument_data_0)
	{
		setFileDocument_Data_0(getContext(), filedocument_data_0);
	}

	/**
	 * Set value of FileDocument_Data_0
	 * @param context
	 * @param filedocument_data_0
	 */
	public final void setFileDocument_Data_0(com.mendix.systemwideinterfaces.core.IContext context, data.proxies.Data filedocument_data_0)
	{
		if (filedocument_data_0 == null)
			getMendixObject().setValue(context, MemberNames.FileDocument_Data_0.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FileDocument_Data_0.toString(), filedocument_data_0.getMendixObject().getId());
	}

	/**
	 * @return value of FileDocument_Data_1
	 */
	public final data.proxies.Data getFileDocument_Data_1() throws com.mendix.core.CoreException
	{
		return getFileDocument_Data_1(getContext());
	}

	/**
	 * @param context
	 * @return value of FileDocument_Data_1
	 */
	public final data.proxies.Data getFileDocument_Data_1(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		data.proxies.Data result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FileDocument_Data_1.toString());
		if (identifier != null)
			result = data.proxies.Data.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FileDocument_Data_1
	 * @param filedocument_data_1
	 */
	public final void setFileDocument_Data_1(data.proxies.Data filedocument_data_1)
	{
		setFileDocument_Data_1(getContext(), filedocument_data_1);
	}

	/**
	 * Set value of FileDocument_Data_1
	 * @param context
	 * @param filedocument_data_1
	 */
	public final void setFileDocument_Data_1(com.mendix.systemwideinterfaces.core.IContext context, data.proxies.Data filedocument_data_1)
	{
		if (filedocument_data_1 == null)
			getMendixObject().setValue(context, MemberNames.FileDocument_Data_1.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FileDocument_Data_1.toString(), filedocument_data_1.getMendixObject().getId());
	}

	/**
	 * @return value of FileDocument_Data_2
	 */
	public final java.util.List<data.proxies.Data> getFileDocument_Data_2() throws com.mendix.core.CoreException
	{
		return getFileDocument_Data_2(getContext());
	}

	/**
	 * @param context
	 * @return value of FileDocument_Data_2
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<data.proxies.Data> getFileDocument_Data_2(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<data.proxies.Data> result = new java.util.ArrayList<data.proxies.Data>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.FileDocument_Data_2.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(data.proxies.Data.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of FileDocument_Data_2
	 * @param filedocument_data_2
	 */
	public final void setFileDocument_Data_2(java.util.List<data.proxies.Data> filedocument_data_2)
	{
		setFileDocument_Data_2(getContext(), filedocument_data_2);
	}

	/**
	 * Set value of FileDocument_Data_2
	 * @param context
	 * @param filedocument_data_2
	 */
	public final void setFileDocument_Data_2(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<data.proxies.Data> filedocument_data_2)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (data.proxies.Data proxyObject : filedocument_data_2)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.FileDocument_Data_2.toString(), identifiers);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final data.proxies.FileDocument that = (data.proxies.FileDocument) obj;
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
		return "Data.FileDocument";
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
