package com.privex.tradeorder.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TradeOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "BORROWER_NAME")
    private String borrowerName;

    @Column(name = "FACILITY_AMOUNT")
    private int facilityAmount;

    @Column(name = "FACILITY_TYPE")
    private String facilityType;

    @Column(name = "MATURITY_DATE")
    private String maturityDate;

    @Column(name = "MARGIN")
    private String margin;

    @Column(name = "PARTIAL_SALE_PERMITTED")
    private String partialSalePermitted;

    @Column(name = "MINIMUM_AMOUNT_TO_SELL")
    private int minimumAmountToSell;

    @Column(name = "MULTIPLE_THERE_AFTER")
    private int multipleThereAfter;

    @Column(name = "AMOUNT_TO_SELL")
    private int amountToSell;

    @Column(name = "OFFER_PRICE")
    private double offerPrice;
}
