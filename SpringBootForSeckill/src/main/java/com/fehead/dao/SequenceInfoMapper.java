package com.fehead.dao;

import com.fehead.dataobject.SequenceInfo;

public interface SequenceInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sat May 11 20:33:41 CST 2019
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sat May 11 20:33:41 CST 2019
     */
    int insert(SequenceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sat May 11 20:33:41 CST 2019
     */
    int insertSelective(SequenceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sat May 11 20:33:41 CST 2019
     */
    SequenceInfo selectByPrimaryKey(String name);

    SequenceInfo getSequenceByName(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sat May 11 20:33:41 CST 2019
     */
    int updateByPrimaryKeySelective(SequenceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sat May 11 20:33:41 CST 2019
     */
    int updateByPrimaryKey(SequenceInfo record);
}