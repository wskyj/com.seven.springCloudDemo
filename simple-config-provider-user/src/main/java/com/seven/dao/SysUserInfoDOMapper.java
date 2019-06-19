package com.seven.dao;

import com.seven.model.SysUserInfoDO;

import java.util.List;

public interface SysUserInfoDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserInfoDO record);

    int insertSelective(SysUserInfoDO record);

    int insertSelective2(SysUserInfoDO record);

    SysUserInfoDO selectByPrimaryKey(Integer id);

    SysUserInfoDO selectByUserName(String userName);

    List<SysUserInfoDO> selectAll();

    int updateByPrimaryKeySelective(SysUserInfoDO record);

    int updateByPrimaryKey(SysUserInfoDO record);
}