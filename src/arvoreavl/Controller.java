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
public class Controller {
    No raiz;
    
    public void insereAVL(int x){}
    
    public void removeAVL(int x){}
    
    No buscaAVL(int x){  //semelhante a operacao de busca em AVL
        return null;
    }
    
    No rotacaoRR(No y){
        No x = y.getDir();
        y.setDir(x.getEsq());
        x.setEsq(y);
        return x;
    }
    No rotacaoLL(No y){
        No x = y.getEsq();
        y.setEsq(x.getDir());
        x.setDir(y);
        return x;
    }
    No rotacaoLR(No x){
        return null;
    }
    No rotacaoRL(No x){
        return null;
    }
    
    
}
