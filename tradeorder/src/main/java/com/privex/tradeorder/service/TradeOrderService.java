package com.privex.tradeorder.service;

import com.privex.tradeorder.entity.TradeOrder;
import com.privex.tradeorder.repository.TradeOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class TradeOrderService {

    private TradeOrderRepository tradeOrderRepository;

    public TradeOrderService(final TradeOrderRepository tradeOrderRepository) {
        this.tradeOrderRepository = tradeOrderRepository;
    }

    //    @PostConstruct
//    public void init() {
//        map = new HashMap<Integer, TradeOrder>();
//        TradeOrder tradeOrder253 =
//                TradeOrder.builder().id(253).borrowerName("Oliver")
//                        .facilityAmount(930000000)
//                        .facilityType("TLF").maturityDate("22-03-2015").margin("LIBOR + 0.00% p.a")
//                        .partialSalePermitted("yes")
//                        .minimumAmountToSell(23000000)
//                        .multipleThereAfter(12000000)
//                        .amountToSell(477000)
//                        .offerPrice(99.00)
//                        .build();
//        TradeOrder tradeOrder394 =
//                TradeOrder.builder().id(394).borrowerName("James").facilityAmount(950000000).facilityType("ALF")
//                        .maturityDate("20-03-2015").margin("LIBOR + 1.00% p.a")
//                        .partialSalePermitted("no").minimumAmountToSell(99000000)
//                        .multipleThereAfter(15000000).amountToSell(577000)
//                        .offerPrice(88.00)
//                        .build();
//        map.put(tradeOrder253.getId(), tradeOrder253);
//        map.put(tradeOrder394.getId(), tradeOrder394);
//    }
    public TradeOrder getById(int id) {
        return tradeOrderRepository.findById(id).get();
    }

    public TradeOrder save(TradeOrder tradeOrder) {
        return tradeOrderRepository.save(tradeOrder);
    }
}
