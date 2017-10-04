/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblacktree;

/**
 *
 * @author 12265041670
 */
public class no {

    private no vpFilho_esq = null;
    private no pai = null;
    private no vpFilho_dir = null;
    private int valor;
    private int cor; // 1 para preto, 0 para vermelho

    public no(int val) {
        this.valor = val;
    }
    
    public no() {
        
    }
    
    public no getVpFilho_esq() {
        return vpFilho_esq;
    }

    public void setVpFilho_esq(no vpFilho_esq) {
        this.vpFilho_esq = vpFilho_esq;
    }

    public no getVpFilho_dir() {
        return vpFilho_dir;
    }

    public void setVpFilho_dir(no vpFilho_dir) {
        this.vpFilho_dir = vpFilho_dir;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public no getPai() {
        return pai;
    }

    public void setPai(no pai) {
        this.pai = pai;
    }

}
