package com.freedom.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import java.nio.file.FileSystems;



/**
 * Created by kuiyuxiang on 2017/4/28.
 */
public class LuceneDemo {
    public static void main(String[] args) {
        Analyzer analyzer = new StandardAnalyzer();

        System.out.println(FileSystems.getDefault());

      //  Directory directory = FSDirectory.open(Pa);


    }
}
