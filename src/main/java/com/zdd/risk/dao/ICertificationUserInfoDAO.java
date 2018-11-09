package com.zdd.risk.dao;

import com.zdd.risk.bean.CertificationUserInfo;
import com.zdd.risk.bean.CertificationUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICertificationUserInfoDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    long countByExample(CertificationUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    int insert(CertificationUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    int insertSelective(CertificationUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    List<CertificationUserInfo> selectByExample(CertificationUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    CertificationUserInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") CertificationUserInfo record, @Param("example") CertificationUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    int updateByExample(@Param("record") CertificationUserInfo record, @Param("example") CertificationUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    int updateByPrimaryKeySelective(CertificationUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certificationUserInfo
     *
     * @mbg.generated Fri Nov 09 11:51:41 CST 2018
     */
    int updateByPrimaryKey(CertificationUserInfo record);
}