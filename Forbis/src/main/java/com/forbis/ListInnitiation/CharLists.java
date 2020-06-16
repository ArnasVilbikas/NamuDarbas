package com.forbis.ListInnitiation;

import java.util.ArrayList;
import java.util.HashMap;

public class CharLists {
    private HashMap<String, ArrayList<String>> mapping = new HashMap<String, ArrayList<String>>();

    ArrayList<String> ListA = new ArrayList<>();
    ArrayList<String> ListB = new ArrayList<>();
    ArrayList<String> ListC = new ArrayList<>();
    ArrayList<String> ListD = new ArrayList<>();
    ArrayList<String> ListE = new ArrayList<>();
    ArrayList<String> ListF = new ArrayList<>();
    ArrayList<String> ListG = new ArrayList<>();
    ArrayList<String> ListH = new ArrayList<>();
    ArrayList<String> ListI = new ArrayList<>();
    ArrayList<String> ListJ = new ArrayList<>();
    ArrayList<String> ListK = new ArrayList<>();
    ArrayList<String> ListL = new ArrayList<>();
    ArrayList<String> ListM = new ArrayList<>();
    ArrayList<String> ListN = new ArrayList<>();
    ArrayList<String> ListO = new ArrayList<>();
    ArrayList<String> ListP = new ArrayList<>();
    ArrayList<String> ListQ = new ArrayList<>();
    ArrayList<String> ListR = new ArrayList<>();
    ArrayList<String> ListS = new ArrayList<>();
    ArrayList<String> ListT = new ArrayList<>();
    ArrayList<String> ListU = new ArrayList<>();
    ArrayList<String> ListV = new ArrayList<>();
    ArrayList<String> ListW = new ArrayList<>();
    ArrayList<String> ListX = new ArrayList<>();
    ArrayList<String> ListY = new ArrayList<>();
    ArrayList<String> ListZ = new ArrayList<>();
    ArrayList<String> ListStorage = new ArrayList<>();



    public ArrayList<String> getList(String ListKey) {
        return mapping.get(ListKey);
    }

    public void Update(String ListKey, String sentValue){ //updates list (selected by char - which is list's key)
        mapping.get(ListKey).add(sentValue);
        String tempString = mapping.get(ListKey).get(1); //we know that number string is saved in second(1) element
        int tempInt = Integer.parseInt(tempString); //we change it from string to integer, to be able to increase it by 1
        tempInt++;
        mapping.get(ListKey).set(1, Integer.toString(tempInt)); //we turn it back to string and replace it with old number string
    }

    public void setList() { //we setup lists for every character in Latin alphabet

        mapping.put("storage",ListStorage); //storage for every new character encountered in the query

        mapping.put("a", ListA);
        ListA.add("a");
        ListA.add("0");

        mapping.put("b", ListB);
        ListB.add("b");
        ListB.add("0");

        mapping.put("c", ListC);
        ListC.add("c");
        ListC.add("0");

        mapping.put("d", ListD);
        ListD.add("d");
        ListD.add("0");

        mapping.put("e", ListE);
        ListE.add("e");
        ListE.add("0");

        mapping.put("f", ListF);
        ListF.add("f");
        ListF.add("0");

        mapping.put("g", ListG);
        ListG.add("g");
        ListG.add("0");

        mapping.put("h", ListH);
        ListH.add("h");
        ListH.add("0");

        mapping.put("i", ListI);
        ListI.add("i");
        ListI.add("0");

        mapping.put("j", ListJ);
        ListJ.add("j");
        ListJ.add("0");

        mapping.put("k", ListK);
        ListK.add("k");
        ListK.add("0");

        mapping.put("l", ListL);
        ListL.add("l");
        ListL.add("0");

        mapping.put("m", ListM);
        ListM.add("m");
        ListM.add("0");

        mapping.put("n", ListN);
        ListN.add("n");
        ListN.add("0");

        mapping.put("o", ListO);
        ListO.add("o");
        ListO.add("0");

        mapping.put("p", ListP);
        ListP.add("p");
        ListP.add("0");

        mapping.put("q", ListQ);
        ListQ.add("q");
        ListQ.add("0");

        mapping.put("r", ListR);
        ListR.add("r");
        ListR.add("0");

        mapping.put("s", ListS);
        ListS.add("s");
        ListS.add("0");

        mapping.put("t", ListT);
        ListT.add("t");
        ListT.add("0");

        mapping.put("u", ListU);
        ListU.add("u");
        ListU.add("0");

        mapping.put("v", ListV);
        ListV.add("v");
        ListV.add("0");

        mapping.put("w", ListW);
        ListW.add("w");
        ListW.add("0");

        mapping.put("x", ListX);
        ListX.add("x");
        ListX.add("0");

        mapping.put("y", ListY);
        ListY.add("y");
        ListY.add("0");

        mapping.put("z", ListZ);
        ListZ.add("z");
        ListZ.add("0");

    }

}

