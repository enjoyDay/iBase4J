package org.ibase4j.dao.generator;

import java.util.List;
import org.ibase4j.model.generator.SysUserThirdparty;

public interface SysUserThirdpartyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_thirdparty
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_thirdparty
     *
     * @mbggenerated
     */
    int insert(SysUserThirdparty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_thirdparty
     *
     * @mbggenerated
     */
    SysUserThirdparty selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_thirdparty
     *
     * @mbggenerated
     */
    List<SysUserThirdparty> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_thirdparty
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysUserThirdparty record);
}