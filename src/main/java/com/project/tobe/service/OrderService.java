package com.project.tobe.service;

import com.project.tobe.dto.*;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    List<OrderHDTO> getOrder(OrderSearchDTO criteria); //jsy 조건조회
    List<PriceDTO> getPrice(Long iocn, String delDate); //jsy 주문등록 판매가 가져오기
    Long registOrder(OrderRegistDTO orderRegistDTO); //jsy 주문 등록하기
    String getMyName(String myId); //이름 얻기


    /*유선화 START*/
    OrderHDTO getOrderDetail(Long orderNo); // 상세 조회
    boolean updateApproval(Long orderNo, String confirmStatus, LocalDate confirmChangeDate, String remarks);
    OrderHDTO updateOrder(OrderUp1DTO orderUp1DTO);
/*
    void insertBack(OrderUp1DTO orderUp1DTO);
 */
    OrderHDTO updateTempOrder(OrderHDTO orderHDTO);
    boolean deleteOrder(Long orderNo);
    /*유선화 END*/

    EmployeeRankDTO getTopOfMonth();

    List<SalesByMonth> getSalesByMonth();

    List<EmployeeRankDTO> getEmployeeRank();

    List<ProductSaleRank> getProductRank();
}
