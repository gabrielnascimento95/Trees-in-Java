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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
