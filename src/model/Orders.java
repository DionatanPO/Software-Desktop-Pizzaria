/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hp
 */
public class Orders {
    private int id;
    private int client_id;
    private int cupom_id;
    private int user_deliveryman_id;
    private double total;
    private int status;
    private int withdrawal;
    private int payment;
    private double change;
    
    public void manter_pedido(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getCupom_id() {
        return cupom_id;
    }

    public void setCupom_id(int cupom_id) {
        this.cupom_id = cupom_id;
    }

    public int getUser_deliveryman_id() {
        return user_deliveryman_id;
    }

    public void setUser_deliveryman_id(int user_deliveryman_id) {
        this.user_deliveryman_id = user_deliveryman_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(int withdrawal) {
        this.withdrawal = withdrawal;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }
    
    
}
