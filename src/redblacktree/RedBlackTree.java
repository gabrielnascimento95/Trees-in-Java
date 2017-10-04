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
public class RedBlackTree {
    private no pai;
    private no tio;
    private no avo;
    private no atual;
    private no raiz = null;
    private no nulo = new no(-1);

    public RedBlackTree(int val) {
        raiz = new no();
        raiz.setVpFilho_dir(null);
        raiz.setVpFilho_esq(null);
        if(!ehVermelho(raiz)){
          raiz.setCor(0);
        }
    }
    
    public boolean ehVermelho(no x){
        if(x==null)
           return false;
        return x.getCor() == 1;
    }
    
    public void insercao(no k){  // 1 para preto, 0 para vermelho
        no aux = this.raiz;
        if(raiz == null){
            raiz = k;
            k.setCor(1);
            k.setPai(null);
        }else{
            k.setCor(0);
            while(true){
                if(k.getValor() < aux.getValor()){
                    if(aux.getVpFilho_esq() == null){
                        aux.setVpFilho_esq(k);
                        k.setPai(aux);
                        break;
                    }else{
                        aux = aux.getVpFilho_esq();
                    }
                }else if(k.getValor() >= aux.getValor()){
                    if(aux.getVpFilho_dir() == null){
                        aux.setVpFilho_dir(k);
                        k.setPai(aux);
                    }else{
                        aux = aux.getVpFilho_esq();
                    }
                }
            }
            reorganizaArvore(k);
            //https://stackoverflow.com/questions/40603255/how-to-make-red-black-tree-generic-in-java
        }
    }
    
    public boolean ehVazia(){
        return raiz.getVpFilho_dir() == null;
    }
    
    public void limparArvore(){
        raiz.setVpFilho_dir(null);
    }
    
    private void reorganizaArvore(no item){
        
    }
    
}
