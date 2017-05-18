package edu.nuist.sms.guyongqiang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import edu.nuist.sms.guyongqiang.util.JDBCUtil;

public class BaseDao {

	/**
	 * 该方法是一个宏观更新的方法
	 * 
	 * @param connection
	 * @param sql
	 * @param params
	 */
	public void update(Connection connection, String sql, Object... params) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			// 为编译的SQL语句填充占位符的值
			for (int i = 0; i < params.length; i++) {
				preparedStatement.setObject(i + 1, params[i]);
			}
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.releaseResources(null, preparedStatement, null);
		}
	}

	/**
	 * 查询一个实体的方法
	 * @param id
	 * @return
	 */
	public <T> T get(Connection connection, Class<T> cls, String sql, Object... params) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		T entity = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				preparedStatement.setObject(i + 1, params[i]);
			}
			resultSet = preparedStatement.executeQuery();
			ResultSetMetaData rsmd = resultSet.getMetaData();
			if (resultSet.next()) {
				// 通过反射构造一个对象
				entity = cls.newInstance();
				// 为对象的属性赋值
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String columnName = rsmd.getColumnLabel(i + 1);
					Object columnValue = resultSet.getObject(i + 1);
					BeanUtils.setProperty(entity, columnName, columnValue);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.releaseResources(resultSet, preparedStatement, null);
		}
		return entity;
	}

	public <T> List<T> getAll(Connection connection, Class<T> cls, String sql, Object... params) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<T> entityList = new ArrayList<T>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				preparedStatement.setObject(i + 1, params[i]);
			}
			resultSet = preparedStatement.executeQuery();
			ResultSetMetaData rsmd = resultSet.getMetaData();
			while (resultSet.next()) {
				T entity = cls.newInstance();
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String columnName = rsmd.getColumnLabel(i + 1);
					Object columnValue = resultSet.getObject(i + 1);
					BeanUtils.setProperty(entity, columnName, columnValue);
				}
				entityList.add(entity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.releaseResources(resultSet, preparedStatement, null);
		}
		return entityList;
	}

}
