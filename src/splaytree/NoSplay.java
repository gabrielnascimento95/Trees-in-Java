/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splaytree;

/**
 *
 * @author 12265041670
 */
public class NoSplay {
    private NoSplay esq, dir, pai;
    private int chave;

    public NoSplay() {
    }

    public NoSplay(int chave) {
        this.chave = chave;
    }

    public NoSplay(NoSplay esq, NoSplay dir, NoSplay pai, int chave) {
        this.esq = esq;
        this.dir = dir;
        this.pai = pai;
        this.chave = chave;
    }

    public NoSplay getEsq() {
        return esq;
    }

    public void setEsq(NoSplay esq) {
        this.esq = esq;
    }

    public NoSplay getDir() {
        return dir;
    }

    public void setDir(NoSplay dir) {
        this.dir = dir;
    }

    public NoSplay getPai() {
        return pai;
    }

    public void setPai(NoSplay pai) {
        this.pai = pai;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
    
}
