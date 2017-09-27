/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreavl;

/**
 *
 * @author Gabriel_Nascimento
 */
public class No {
    private int altura;
    private int valor;
    private int fatorBalanceamento;
    private No dir;
    private No esq;

    public No(No proximo, No anterior) {
        this.dir = proximo;
        this.esq = anterior;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getFatorBalanceamento() {
        return fatorBalanceamento;
    }

    public void setFatorBalanceamento(int fatorBalanceamento) {
        this.fatorBalanceamento = fatorBalanceamento;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No proximo) {
        this.dir = proximo;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No anterior) {
        this.esq = anterior;
    }
}
