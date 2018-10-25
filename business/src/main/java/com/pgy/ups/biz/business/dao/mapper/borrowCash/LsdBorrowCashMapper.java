package com.pgy.ups.biz.business.dao.mapper.borrowCash;


import com.pgy.ups.biz.facade.model.borrowCash.LsdBorrowCash;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface LsdBorrowCashMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_borrow_cash
     *
     * @mbggenerated Mon Oct 22 11:40:57 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_borrow_cash
     *
     * @mbggenerated Mon Oct 22 11:40:57 CST 2018
     */
    int insert(LsdBorrowCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_borrow_cash
     *
     * @mbggenerated Mon Oct 22 11:40:57 CST 2018
     */
    int insertSelective(LsdBorrowCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_borrow_cash
     *
     * @mbggenerated Mon Oct 22 11:40:57 CST 2018
     */
    LsdBorrowCash selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_borrow_cash
     *
     * @mbggenerated Mon Oct 22 11:40:57 CST 2018
     */
    int updateByPrimaryKeySelective(LsdBorrowCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_borrow_cash
     *
     * @mbggenerated Mon Oct 22 11:40:57 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(LsdBorrowCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_borrow_cash
     *
     * @mbggenerated Mon Oct 22 11:40:57 CST 2018
     */
    int updateByPrimaryKey(LsdBorrowCash record);


    List<LsdBorrowCash> getEverydayList(@Param("startDate") Date startDate,@Param("endDate") Date endDate);


}