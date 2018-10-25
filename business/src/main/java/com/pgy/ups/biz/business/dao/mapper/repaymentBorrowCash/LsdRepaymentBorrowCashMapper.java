package com.pgy.ups.biz.business.dao.mapper.repaymentBorrowCash;


import com.pgy.ups.biz.facade.model.repaymentBorrowCash.LsdRepaymentBorrowCash;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface LsdRepaymentBorrowCashMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_repayment_borrow_cash
     *
     * @mbggenerated Fri Oct 19 14:29:51 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_repayment_borrow_cash
     *
     * @mbggenerated Fri Oct 19 14:29:51 CST 2018
     */
    int insert(LsdRepaymentBorrowCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_repayment_borrow_cash
     *
     * @mbggenerated Fri Oct 19 14:29:51 CST 2018
     */
    int insertSelective(LsdRepaymentBorrowCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_repayment_borrow_cash
     *
     * @mbggenerated Fri Oct 19 14:29:51 CST 2018
     */
    LsdRepaymentBorrowCash selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_repayment_borrow_cash
     *
     * @mbggenerated Fri Oct 19 14:29:51 CST 2018
     */
    int updateByPrimaryKeySelective(LsdRepaymentBorrowCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsd_repayment_borrow_cash
     *
     * @mbggenerated Fri Oct 19 14:29:51 CST 2018
     */
    int updateByPrimaryKey(LsdRepaymentBorrowCash record);

    List<LsdRepaymentBorrowCash> getEverydayList(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}