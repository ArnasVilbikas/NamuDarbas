package com.forbis.ListInnitiation;


public class TextDecomposition {
    CharLists charList = new CharLists();

    public String[] Setup(String textInput){
        charList.setList();
        String character;
        String returnList = "";


        String[] splitStr = textInput.replaceAll("\\w*\\d+\\w* *", "").split(" +"); //only takes words that uses Latin alphabet

        for (String s : splitStr) {
            character = s.substring(s.length() - 1);
            character = character.toLowerCase();
            charList.Update(character, s);

            if (charList.getList("storage").contains(character)) { // if that char was already stored, then we don't need the duplicate
            } else {
                charList.getList("storage").add(character); // we're saving chars that were received during this query (that's useful as char is the map key)
            }
        }

        charList.getList("storage").sort(String::compareToIgnoreCase);//sorts outcomes alphabetically
        
        
        String [] returnArray = new String[charList.getList("storage").size()];

        for(int i=0; i< charList.getList("storage").size(); i++){

            String tempChar = charList.getList("storage").get(i);

            for(int j=0; j<charList.getList(tempChar).size();j++){
                returnList = returnList + charList.getList(tempChar).get(j) + " ";
            }

            returnArray[i] = returnList;
            returnList = "";
        }

        return returnArray;
    }

}
