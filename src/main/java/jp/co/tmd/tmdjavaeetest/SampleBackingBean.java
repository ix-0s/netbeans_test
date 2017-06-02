/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.tmd.tmdjavaeetest;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author tatsuya
 */
@RequestScoped
public class SampleBackingBean implements Serializable{
    private String message1;

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }
    
}
