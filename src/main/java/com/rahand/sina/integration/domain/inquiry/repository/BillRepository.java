package com.rahand.sina.integration.domain.inquiry.repository;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.common.util.DBUtility;
import com.rahand.sina.integration.domain.inquiry.dto.MyBillDto;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BillRepository {

    public void saveBill(MyBillDto myBillDto) {

        String query = "BEGIN MERGE INTO xti22userbillid ub USING (SELECT ? nationalcode,? BILLID FROM DUAL) UBD ON (ub.nationalcode = ubd.nationalcode AND ub.billid = ubd.billid)\n" +
                "WHEN NOT MATCHED  THEN INSERT (NATIONALCODE,BILLNAME,BILLID,BILLTYPE) VALUES(?,?,?,?);COMMIT;END;";

        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {

            preparedStatement.setString(1, myBillDto.getUserId());
            preparedStatement.setString(2, myBillDto.getBillId());
            preparedStatement.setString(3, myBillDto.getUserId());
            preparedStatement.setString(4, myBillDto.getBillName());
            preparedStatement.setString(5, myBillDto.getBillId());
            preparedStatement.setString(6, myBillDto.getBillType().getName());

            preparedStatement.executeQuery();

        } catch (SQLException e) {
            CommonUtil.logError(getClass().getSimpleName(), "saveBill", e.toString());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

    }

    public List<MyBillDto> getMyBills(String userId) {

        List<MyBillDto> myBills = new ArrayList<>();

        String query = "select t.billid,t.payid,t.billtype,t.billname,t.amountbill from  xti22userbillid t  where t.nationalcode=? order by t.insertdate DEsc";

        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {

            preparedStatement.setString(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            MyBillDto myBillDto;
            while (resultSet.next()) {

                myBillDto = new MyBillDto();
                myBillDto.setBillName(resultSet.getString("billname"));
                myBillDto.setBillType(BillType.get(resultSet.getString("billtype")));
                myBillDto.setBillId(resultSet.getString("billid"));
                myBillDto.setPayId(resultSet.getString("payid"));
                myBillDto.setSavedBill(true);

                myBills.add(myBillDto);
            }
        } catch (SQLException e) {
            CommonUtil.logError(getClass().getSimpleName(), "getMyBills", e.toString());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        return myBills;

    }
}
