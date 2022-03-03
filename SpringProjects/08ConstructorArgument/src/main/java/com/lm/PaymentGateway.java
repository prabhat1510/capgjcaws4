package com.lm;

public class PaymentGateway {
	 
    private Order order;
     
    public PaymentGateway(Order ord){
        this.order = ord;
    }
     
    public void setOrder(Order ord){
        this.order = ord;
    }
     
    public void processOrder(){
        System.out.println("Processing order: "+order.getItem());
    }
}