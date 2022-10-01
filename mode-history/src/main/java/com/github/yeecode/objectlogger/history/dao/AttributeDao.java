package com.github.yeecode.objectlogger.history.dao;

import com.github.yeecode.objectlogger.client.model.AttributeModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AttributeDao {

    List<AttributeModel> queryByOperationIdList(List<Integer> operationIdList);

    List<AttributeModel> queryByFilter(AttributeModel attributeModel);

    Integer addBatch(@Param("attributeModelList") List<AttributeModel> attributeModelList);
}
