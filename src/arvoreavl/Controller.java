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
    private No raiz = null;

    public Controller() {
        this.raiz = null;
    }
    
    public void limpaArvore(){
        this.raiz = null;
    }
    
    public boolean ehVazia(){
        return this.raiz == null;
    }
    
    public No getRaiz(){
        return this.raiz;
    }
    
    public int retornaAltura(No aux){
        return aux == null ? -1 : aux.getAltura();
    }
    
    public int retormaMaior(int esq, int dir){
        return  esq > dir ? esq : dir;
    }
    
    private int getFatorBalanceamento(No aux){
        return retornaAltura(aux.getEsq()) - retornaAltura(aux.getDir());
    }
    
    public boolean insereAVL(int x){
        this.raiz = auxInsere(x,raiz);
        return true;
    }
    
     private No auxInsere(int x, No aux) {
        if(aux == null){
            aux = new No(x,null,null);
        }else if(x < aux.getValor()){
            aux.setEsq(auxInsere(x, aux.getEsq()));
        }else if(x < aux.getValor()){
            aux.setDir(auxInsere(x, aux.getDir()));
        }
        aux = balancear(aux);
        return aux;
    }
     
     private No balancear(No aux) {
         if ( getFatorBalanceamento(aux) == 2 ) {
                    if (getFatorBalanceamento (aux.getEsq())>0) 
                        aux = rotacaoRR(aux);
                    else 
                        aux = rotacaoRL(aux);
            }
            else if ( getFatorBalanceamento(aux) == -2 ) {
                    if ( getFatorBalanceamento(aux.getDir())<0 ) 
                        aux = rotacaoLL(aux);
                    else 
                        aux = rotacaoLR(aux);
            }
            aux.setAltura(retormaMaior(retornaAltura(aux.getEsq() ), retornaAltura(aux.getDir() ) ) + 1);
            return aux;
    }

         
    public No buscaAVL(int x){  //semelhante a operacao de busca em AVL
        return auxBusca(raiz, x);
    }
    
    private No auxBusca(No x, int val){
        while(x != null){
            if(val == x.getValor()){
                return x;
            }else if(val < x.getValor()){
                x = x.getEsq();
            }else{
                x = x.getDir();
            }
        }
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
        x.setDir(rotacaoLL(x.getDir()));
       return rotacaoLL(x);
    }
    No rotacaoRL(No x){
        x.setEsq(rotacaoLL(x.getEsq()));
        return rotacaoRR(x);
    }

   
    
    
}
