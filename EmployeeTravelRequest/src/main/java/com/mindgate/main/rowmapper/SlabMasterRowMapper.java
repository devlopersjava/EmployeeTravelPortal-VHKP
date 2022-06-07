package com.mindgate.main.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mindgate.main.pojo.SlabMaster;

@Component
public final class SlabMasterRowMapper implements RowMapper<SlabMaster> {

		@Override
		public SlabMaster mapRow(ResultSet resultSet, int arg1) throws SQLException {

			int slabId = resultSet.getInt("SLAB_ID");
			String travelMode = resultSet.getString("TRAVEL_MODE");
			double slabAmount = resultSet.getDouble("SLAB_AMOUNT");
			String travelWay = resultSet.getString("TRAVEL_WAY");

			SlabMaster slabMaster = new SlabMaster(slabId, travelMode, slabAmount, travelWay);

			return slabMaster;
		}

	}