/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appsms;

/**
 *
 * @author khalila
 */
public interface WebSocketListener {
    void onOpen();
    
    void onClose();
    
    void onError();
    
    void onMessage(String message);
}
