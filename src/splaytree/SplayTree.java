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
public class SplayTree {
    private NoSplay raiz;
    private int contaNos = 0;

    public SplayTree() {
        this.raiz = null;
    }
    
    public boolean ehVazia(){
        return raiz == null;
    }
    
    public void limpaArvore(){
        raiz = null;
    }
    
    public void insereElemento(int val){
        NoSplay aux = raiz;
        NoSplay aux2 = null;
        while(aux != null){
            aux2 = aux;
            if(val < aux2.getChave())
                aux = aux.getDir();
            else
                aux = aux.getEsq();
        }
        aux = new NoSplay();
        aux.setChave(val);
        aux.setPai(aux2);
        if(aux2 == null)
            raiz = aux;
        else if(val < aux2.getChave())
            aux2.setDir(aux);
        else
            aux2.setEsq(aux);
        fazSplay(aux);
        contaNos++;
    }

    private void fazSplay(NoSplay aux) {
        while(aux.getPai() != null){
            NoSplay pai = aux.getPai();
            NoSplay avo = pai.getPai();
            if(avo == null){
                if(aux == pai.getEsq()){
                    rotacaoEsquerda(aux,pai);
                }else
                    rotacaoDireita(aux,pai);
            }else{
                if(aux == pai.getEsq()){
                    if(pai == avo.getEsq()){
                        rotacaoEsquerda(pai, avo);
                        rotacaoEsquerda(aux, pai);
                    }else{
                        rotacaoEsquerda(aux, aux.getPai());
                        rotacaoDireita(aux, aux.getPai());
                    }
                }else{
                    if(pai == avo.getEsq()){
                        rotacaoDireita(aux, aux.getPai());
                        rotacaoEsquerda(aux, aux.getPai());
                    }else{
                        rotacaoDireita(pai, avo);
                        rotacaoDireita(aux, pai);
                    }
                }
            }
        }
        raiz = aux;
    }

    private void rotacaoDireita(NoSplay a, NoSplay b) {
        if((a == null) || (b == null) || (b.getDir() != a) || (a.getPai() != b)){
            throw new Error("Erro");
        }
        if(b.getPai() != null){
            if(b == b.getPai().getEsq()){
                b.getPai().setEsq(a);
            }else{
                b.getPai().setDir(a);
            }
        }
        if(a.getEsq() != null){
            a.getEsq().setPai(b);
        }
        a.setPai(b.getPai());
        b.setPai(a);
        b.setDir(b.getEsq());
        a.setEsq(b);
    }

    private void rotacaoEsquerda(NoSplay a, NoSplay b) {
        if((a == null) || (b == null) || (b.getEsq() != a) || (a.getPai() != b)){
            throw new Error("Erro");
        }
        if(b.getPai() != null){
            if(b == b.getPai().getEsq()){
                b.getPai().setEsq(a);
            }else{
                b.getPai().setDir(a);
            }
        }
        if(a.getDir() != null){
            a.getDir().setPai(b);
        }
        a.setPai(b.getPai());
        b.setPai(a);
        b.setEsq(b.getDir());
        a.setDir(b);
    }
    
    public int numNos(){
        return contaNos;
    }
    
    public boolean procuraElemento(int chave){
        return procuraChave(chave) != null;
    }

    private NoSplay procuraChave(int chave) {
      NoSplay a = raiz;
      while(a != null){
          if(chave < a.getChave())
              a = a.getDir();
          else if(chave > a.getChave())
              a = a.getEsq();
          else
              return a;
      }
      return null;
    }
}
