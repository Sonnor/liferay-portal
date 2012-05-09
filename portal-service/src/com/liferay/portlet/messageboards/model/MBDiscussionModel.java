/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.messageboards.model;

import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the MBDiscussion service. Represents a row in the &quot;MBDiscussion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.messageboards.model.impl.MBDiscussionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.messageboards.model.impl.MBDiscussionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MBDiscussion
 * @see com.liferay.portlet.messageboards.model.impl.MBDiscussionImpl
 * @see com.liferay.portlet.messageboards.model.impl.MBDiscussionModelImpl
 * @generated
 */
public interface MBDiscussionModel extends AttachedModel, BaseModel<MBDiscussion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a message boards discussion model instance should use the {@link MBDiscussion} interface instead.
	 */

	/**
	 * Returns the primary key of this message boards discussion.
	 *
	 * @return the primary key of this message boards discussion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this message boards discussion.
	 *
	 * @param primaryKey the primary key of this message boards discussion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the discussion ID of this message boards discussion.
	 *
	 * @return the discussion ID of this message boards discussion
	 */
	public long getDiscussionId();

	/**
	 * Sets the discussion ID of this message boards discussion.
	 *
	 * @param discussionId the discussion ID of this message boards discussion
	 */
	public void setDiscussionId(long discussionId);

	/**
	 * Returns the fully qualified class name of this message boards discussion.
	 *
	 * @return the fully qualified class name of this message boards discussion
	 */
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this message boards discussion.
	 *
	 * @return the class name ID of this message boards discussion
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this message boards discussion.
	 *
	 * @param classNameId the class name ID of this message boards discussion
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this message boards discussion.
	 *
	 * @return the class p k of this message boards discussion
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this message boards discussion.
	 *
	 * @param classPK the class p k of this message boards discussion
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the thread ID of this message boards discussion.
	 *
	 * @return the thread ID of this message boards discussion
	 */
	public long getThreadId();

	/**
	 * Sets the thread ID of this message boards discussion.
	 *
	 * @param threadId the thread ID of this message boards discussion
	 */
	public void setThreadId(long threadId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(MBDiscussion mbDiscussion);

	public int hashCode();

	public CacheModel<MBDiscussion> toCacheModel();

	public MBDiscussion toEscapedModel();

	public String toString();

	public String toXmlString();
}