package com.infer.utils;

import java.util.Collection;

/**
 * Created by Anoop on 6/15/2015.
 */
public interface Dictionary {
    void add(String str);
    boolean contains(String str);
    Collection<String> getWords();
}

