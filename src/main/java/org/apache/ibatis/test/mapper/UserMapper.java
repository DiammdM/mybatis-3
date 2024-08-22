package org.apache.ibatis.test.mapper;

import org.apache.ibatis.test.entity.SysUser;

import java.util.List;

/**
 * UserMapper
 *
 * @author: Diammd
 * @since: 2024/8/23
 */
public interface UserMapper {
  List<SysUser> getList();
}

