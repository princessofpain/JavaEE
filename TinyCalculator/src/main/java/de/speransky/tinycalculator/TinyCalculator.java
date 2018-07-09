/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.speransky.tinycalculator;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author CSperansky
 */
@Named(value = "tinyCalculator")
@RequestScoped
public class TinyCalculator {
    
    public TinyCalculator() {
    } 
    
    private double _param1;
    private double _param2;
    private double _result;
    
    public double getParam1() {
        return _param1;
    }
    
    public void setParam1(double param1) {
        _param1 = param1;
    }
    
    public double getParam2() {
        return _param2;
    }
    
    public void setParam2(double param2) {
        _param2 = param2;
    }
    
    public double getResult() {
        return _result;
    }
    
    public void setResult(double result) {
        _result = result;
    }
    
    public String add() {
        _result = _param1 + _param2;
        return "";
    }
    
    public String subtract() {
        _result = _param1 - _param2;
        return "";
    }
    
    public String multiply() {
        _result = _param1 * _param2;
        return "";
    }
    
    public String divide() {
        _result = _param1 / _param2;
        return "";
    }
}
