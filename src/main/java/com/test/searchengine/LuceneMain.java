package com.test.searchengine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LuceneMain {


    public static void main(String arg[]) {
        // starting to build index
        LuceneBuildIndex.start();

        // starting to search the key word.
        LuceneSearchExample.start("query reformulation");

    }

    public static List<String> startSearchEngine(String query) throws IOException {

        // starting to build index
        delete();
        LuceneBuildIndex.start();

        // starting to search the key word.
        List<String> str = LuceneSearchExample.start(query);

        return str;

    }

   private static void delete() throws IOException {
       if(!Files.list(Paths.get(LuceneConstants.INDEX_DIR)).findAny().isPresent()){
           Files.delete(Paths.get(LuceneConstants.INDEX_DIR));
       }
   }

}