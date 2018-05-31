package com.bovenn.cloud.common.model.ddd;

import java.io.Serializable;

/**
* @Description: 领域实体接口。所有实体类都要直接或间接实现这个接口。它主要起标记作用，以便于统一处理系统中的实体等。
* @author kissy
* @date 2017/10/24 下午4:44
*/
public interface Entity extends Serializable {

	/**
	 * 取得实体的Id。实体类的每个实例都必须有个唯一Id以标识自身。
	 * 实体Id必须是可序列化的。
	 * @return 实体实例的 Id.
	 */
	Serializable getKey();
	/**
	 * 是否在数据库中已经存在
	 * @return 如果该实体以存在于数据库中，返回true，否则返回false
	 */
	boolean existed();
}