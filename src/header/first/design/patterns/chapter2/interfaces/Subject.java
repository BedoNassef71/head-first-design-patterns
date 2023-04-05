/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package header.first.design.patterns.chapter2.interfaces;

/**
 *
 * @author hp
 */
public interface Subject {
    
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObervers();
    
}
