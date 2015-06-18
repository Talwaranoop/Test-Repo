package com.infer.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * The EntityDictionary is a Dictionary implementation.
 * This program implements an application that stores
 * distinct words in it.
 * HashSet has been used in this program because it
 * doesn't allows duplicate values,even if a duplicate
 * value would be entered by user the HashSet would
 * overwrite it.
 * @author Anoop
 * @since 6/16/2015.
 */

public class EntityDictionary implements Dictionary {
    Set<String> hs = new HashSet<String>();//HashSet declaration
    /**
     * This method adds the word to the dictionary.
     * @param str : This parameter has been used to
     *            add the word to the dictionary.
     */
        public void add(String str)throws IllegalArgumentException {
            if(str == null)
                throw new IllegalArgumentException("The string cannot be null!");
            if (str.isEmpty())
                throw new IllegalArgumentException("String cannot be empty");
            if (str.matches(".*[^ A-Za-z0-9].*"))//Regular expression for matching special characters.
                throw new IllegalArgumentException("String cannot contain special characters");
            if (str.matches(".*[0-9].*"))//Regular expression for matching numbers.
                throw new IllegalArgumentException("String cannot contain numbers");
            hs.add(str);//add elements to HashSet

        }

    /**
     * This method checks whether the specified Object
     * is present in the dictionary or not. If the object has been
     * found it returns true else false.
     */
        public boolean contains(String str) {
            return (hs.contains(str));

        }

    /**
     * This method checks the total number of words in the
     * dictionary.
     * @return :Returns all the words present in the dictionary.
     */
        public Collection<String> getWords() {
            hs.size();
            return hs;
        }
    }


