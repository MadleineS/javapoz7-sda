package com.sda.service;


import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class WriterService {
    public String write(String name){
        return prefix(name)+ content(name) + suffix(name);


//        if (name != null && name.toUpperCase().equals(name)){
//            return "HELLO, " + name + "!";
//        }
//        String nameToDisplay = name == null ?"my friend" : name;
//        return "Hello, " + nameToDisplay + ".";

//        if (name == null){
//           return "Hello, my friend.";
        }

    private String prefix(String name) {
        return isCapitalizedName(name) ? "HELLO, " : "Hello, ";
    }

    private String content(String name) {
        if (StringUtils.isBlank(name)){
            return "my firend";
        }
        StringBuilder builder = new StringBuilder();
        String[] names = name.split(",");
        for (int i = 0; i < names.length - 1; i++) {
            builder.append(names[i])
                    .append(getDelimiter(i, names,name));
//                            isCapitalizedName(name) ? "AND": "amd")

        }

        return builder.append(names[names.length -1]).toString();
        //return StringUtils.isBlank(name)  ? "my friend" : name;
    }
    private String getDelimiter(int index, String[] names, String name){
        return index != names.length - 2 ? ", " : (
                isCapitalizedName(name) ? "AND" : " amd ");

    }

    private String suffix(String name) {
        return isCapitalizedName(name) ? "!" : ".";
    }
    private boolean isCapitalizedName(String name){
        return StringUtils.isNotBlank(name) && name.toUpperCase().equals(name);
    }
//    "" -> "Hello, my friend!"

    public static void main(String[]args){
        WriterService writerService = new WriterService();
        String write = writerService.write("");


        System.out.println(write);
    }
}
