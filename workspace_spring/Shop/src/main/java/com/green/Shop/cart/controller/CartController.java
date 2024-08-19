package com.green.Shop.cart.controller;

import com.green.Shop.cart.service.CartServiceImpl;
import com.green.Shop.cart.vo.CartVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api-cart")
@RestController
public class CartController {
    @Resource(name = "cartService")
    private CartServiceImpl cartService;

    @PostMapping("/regCart")
    void regCart(@RequestBody CartVO cartVO){
        //등록할 아이템이 이미 등록된 제품인가?
        List<CartVO> earlyList = cartService.getMyCart(cartVO.getMemId());
        if(earlyList==earlyList){
            cartService.updateCart(cartVO);
        }
        else {
            cartService.regCart(cartVO);
        }
    }

    @GetMapping("/getMyCart/{memId}")
    List<CartVO> getMyCart(@PathVariable("memId") String memId){
        return cartService.getMyCart(memId);
    }

    @DeleteMapping("/deleteCart/{cartCode}")
    void deleteCart(@PathVariable("cartCode") int cartCode){
        cartService.deleteCart(cartCode);
    }

    @PutMapping("/updateCart")
    void updateCart(@RequestBody CartVO cartVO){
        cartService.updateCart(cartVO);
    }
}
