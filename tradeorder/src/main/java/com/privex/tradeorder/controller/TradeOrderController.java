package com.privex.tradeorder.controller;

import com.privex.tradeorder.entity.TradeOrder;
import com.privex.tradeorder.service.TradeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*")
public class TradeOrderController {

    @Autowired
    private TradeOrderService tradeOrderService;

    @GetMapping("/{id}")
    public ResponseEntity<TradeOrder> getTradeOrder(@PathVariable int id) {
        return new ResponseEntity<TradeOrder>(tradeOrderService.getById(id), HttpStatus.OK);
    }
}
