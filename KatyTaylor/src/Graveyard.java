
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hosfo
 */
public class Graveyard {

    public static Scanner qwe;
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        qwe = new Scanner(new File("graveyard.dat"));
        
        ArrayList<String> A = new ArrayList();
        ArrayList<String> B = new ArrayList();
        ArrayList<String> C = new ArrayList();
        ArrayList<String> D = new ArrayList();
        ArrayList<String> E = new ArrayList();
        ArrayList<String> F = new ArrayList();
        ArrayList<String> G = new ArrayList();
        ArrayList<String> H = new ArrayList();
        ArrayList<String> I = new ArrayList();
        ArrayList<String> J = new ArrayList();
        ArrayList<String> K = new ArrayList();
        ArrayList<String> L = new ArrayList();
        ArrayList<String> M = new ArrayList();
        ArrayList<String> N = new ArrayList();
        ArrayList<String> O = new ArrayList();
        ArrayList<String> P = new ArrayList();
        ArrayList<String> Q = new ArrayList();
        ArrayList<String> R = new ArrayList();
        ArrayList<String> S = new ArrayList();
        ArrayList<String> T = new ArrayList();
        ArrayList<String> U = new ArrayList();
        ArrayList<String> V = new ArrayList();
        ArrayList<String> W = new ArrayList();
        ArrayList<String> X = new ArrayList();
        ArrayList<String> Y = new ArrayList();
        ArrayList<String> Z = new ArrayList();
        
        while(qwe.hasNext()){
           // System.out.println("Hello");
           String temp = qwe.nextLine().toUpperCase();
           // System.out.println(temp+" temp");
            String[] sent = temp.split("");
            for (int i = 0; i < sent.length; i++) {
               // System.out.println(sent[i]+" qwewert");
                if (sent[i].equals("A"))A.add(sent[i]); 
                if (sent[i].equals("B"))B.add(sent[i]); 
                if (sent[i].equals("C"))C.add(sent[i]); 
                if (sent[i].equals("D"))D.add(sent[i]); 
                if (sent[i].equals("E"))E.add(sent[i]); 
                if (sent[i].equals("F"))F.add(sent[i]); 
                if (sent[i].equals("G"))G.add(sent[i]); 
                if (sent[i].equals("H"))H.add(sent[i]); 
                if (sent[i].equals("I"))I.add(sent[i]); 
                if (sent[i].equals("J"))J.add(sent[i]); 
                if (sent[i].equals("K"))K.add(sent[i]); 
                if (sent[i].equals("L"))L.add(sent[i]); 
                if (sent[i].equals("M"))M.add(sent[i]); 
                if (sent[i].equals("N"))N.add(sent[i]); 
                if (sent[i].equals("O"))O.add(sent[i]); 
                if (sent[i].equals("P"))P.add(sent[i]); 
                if (sent[i].equals("Q"))Q.add(sent[i]); 
                if (sent[i].equals("R"))R.add(sent[i]); 
                if (sent[i].equals("S"))S.add(sent[i]); 
                if (sent[i].equals("T"))T.add(sent[i]); 
                if (sent[i].equals("U"))U.add(sent[i]); 
                if (sent[i].equals("V"))V.add(sent[i]); 
                if (sent[i].equals("W"))W.add(sent[i]); 
                if (sent[i].equals("X"))X.add(sent[i]); 
                if (sent[i].equals("Y"))Y.add(sent[i]); 
                if (sent[i].equals("Z"))Z.add(sent[i]); 
            }
            
        }
        //System.out.println(A);
        ArrayList<ArrayList<String>> all = new ArrayList();
        all.add(A);
        all.add(B);
        all.add(C);
        all.add(D);
        all.add(E);
        all.add(F);
        all.add(G);
        all.add(H);
        all.add(I);
        all.add(J);
        all.add(K);
        all.add(L);
        all.add(M);
        all.add(N);
        all.add(O);
        all.add(P);
        all.add(Q);
        all.add(R);
        all.add(S);
        all.add(T);
        all.add(U);
        all.add(V);
        all.add(W);
        all.add(X);
        all.add(Y);
        all.add(Z);
       
        
        all.sort(new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                 return ((ArrayList)(o1)).size() - ((ArrayList)o2).size();
                    
                
            }
        });
        Collections.reverse(all);
        for (int i = 0; i < all.size(); i++) {
            if(!all.get(i).isEmpty()){
            for (int j = 0; j < all.get(i).size(); j++) {
                
                System.out.print(all.get(i).get(j));
            }
            System.out.println("");
            }
        }
    }
    
}
