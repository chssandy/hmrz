package com.hmrz.common.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


public class JsonTypeHandler extends BaseTypeHandler<JSONObject>{

	@Override
	public JSONObject getNullableResult(ResultSet rs, String col)
			throws SQLException {
		String colValue = rs.getString(col);
		return colValue ==null ? null:JSON.parseObject(colValue);
	}

	@Override
	public JSONObject getNullableResult(ResultSet rs, int index)
			throws SQLException {
		String colValue = rs.getString(index);
		return colValue ==null ? null:JSON.parseObject(colValue);
	}

	@Override
	public JSONObject getNullableResult(CallableStatement cs, int index)
			throws SQLException {
		String colValue = cs.getString(index);
		return colValue ==null ? null:JSON.parseObject(colValue);
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int index,
			JSONObject json, JdbcType type) throws SQLException {
		ps.setString(index,json==null?"":json.toString());
	}


}
