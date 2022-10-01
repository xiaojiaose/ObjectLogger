package com.github.yeecode.objectlogger.history.dao;

import com.github.yeecode.objectlogger.client.model.OperationModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author mengdewei
 */
@Mapper
public interface OperationDao {

    List<OperationModel> queryByFilter(OperationModel operationModel);

    Integer add(OperationModel logOperationModel);
}
