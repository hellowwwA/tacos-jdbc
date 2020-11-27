package com.yyelloow.tacosjdbc.data;


import com.yyelloow.tacosjdbc.Order;

public interface OrderRepository {
    Order save(Order save);
}
