/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cercle;

import java.util.Scanner;

/* Desenvolupament d'Aplicacions Multiplataforma 1 - Curs 2017-2018
 * Mòdul professional 3: Programació 
 * @author PortatilAsus
 * Projecte: Cercle (Cercle)
 * Data: 01-abr-2019 17:44:22
 * Arxiu: Cercle.java
 * Descripció:
 * Notes:
 * Conclusions:
 */

public class Cercle{



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cercle other = (Cercle) obj;
        if (Float.floatToIntBits(this.x) != Float.floatToIntBits(other.x)) {
            return false;
        }
        if (Float.floatToIntBits(this.y) != Float.floatToIntBits(other.y)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Float.floatToIntBits(this.x);
        hash = 59 * hash + Float.floatToIntBits(this.y);
        return hash;
    }

    @Override
    public String toString() {
        return "Cercle{" + "x=" + x + ", y=" + y + '}';
    }
    
 private float x;
 private float y;
 Cercle(float xx, float yy)
 {
 x=xx;
 y=yy;
 }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
 
 public Cercle(Cercle cercle){
     this.x = cercle.x;
     this.y = cercle.y;
 }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public static void main(String[] args) {
    Cercle cercle = new Cercle(1,2);
    }
}

