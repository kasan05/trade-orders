package com.privex.tradeorder;

import com.privex.tradeorder.entity.TradeOrder;
import com.privex.tradeorder.service.TradeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeorderApplication implements CommandLineRunner {

    @Autowired
    private TradeOrderService tradeOrderService;

    public static void main(String[] args) {
        SpringApplication.run(TradeorderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Inserting the data in the mysql table.
        TradeOrder tradeOrder253 =
                TradeOrder.builder().id(253).borrowerName("Oliver")
                        .facilityAmount(930000000)
                        .facilityType("TLF").maturityDate("22-03-2015").margin("LIBOR + 0.00% p.a")
                        .partialSalePermitted("yes")
                        .minimumAmountToSell(23000000)
                        .multipleThereAfter(12000000)
                        .amountToSell(477000)
                        .offerPrice(99.00)
                        .build();
        TradeOrder tradeOrder394 =
                TradeOrder.builder().id(394).borrowerName("James").facilityAmount(950000000).facilityType("ALF")
                        .maturityDate("20-03-2015").margin("LIBOR + 1.00% p.a")
                        .partialSalePermitted("no").minimumAmountToSell(99000000)
                        .multipleThereAfter(15000000).amountToSell(577000)
                        .offerPrice(88.00)
                        .build();
        tradeOrderService.save(tradeOrder253);
        tradeOrderService.save(tradeOrder394);
    }
}
