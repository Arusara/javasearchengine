~~~~
            JAVA Search Engine using Lucene
~~~~

**Tech Stack:**

Front end : JSP and Servlet 

Back end : Apache lucene

Build tool : Apache Maven 

Server : Jetty Server



**Installation**

Apache Lucene is an open-source information retrieval toolkit written in Java.

The easiest way to use Lucene in your project is to import it using Maven. You need to at least import lucene-core (just pasting the following to your pom.xml's dependencies).
~~~~
<dependency>
    <groupId>org.apache.lucene</groupId>
    <artifactId>lucene-core</artifactId>
    <version>7.4.0</version>
</dependency>

<dependency>
    <groupId>org.apache.lucene</groupId>
    <artifactId>lucene-analyzers-common</artifactId>
    <version>7.4.0</version>
</dependency>

<dependency>
    <groupId>org.apache.lucene</groupId>
    <artifactId>lucene-queryparser</artifactId>
    <version>7.4.0</version>
</dependency>
~~~~
If you do not use Maven, you need to download the jar files by yourself and include them into your project. Make sure you download the correct version. http://archive.apache.org/dist/lucene/java/7.4.0/


**Build an Index**

The following  data format is used to build an index 
~~~~
<DOC>
<DOCNO>ACM-383972</DOCNO>
<TITLE>Relevance based language models</TITLE>
<AUTHOR>Victor Lavrenko, W. Bruce Croft</AUTHOR>
<SOURCE>Proceedings of the 24th annual international ACM SIGIR conference on Research and development in information retrieval</SOURCE>
<TEXT>
We explore the relation between classical probabilistic models of information retrieval and the emerging language modeling approaches. It has long been recognized that the primary obstacle to effective performance of classical models is the need to estimate a relevance model : probabilities of words in the relevant class. We propose a novel technique for estimating these probabilities using the query alone. We demonstrate that our technique can produce highly accurate relevance models, addressing important notions of synonymy and polysemy. Our experiments show relevance models outperforming baseline language modeling systems on TREC retrieval and TDT tracking tasks. The main contribution of this work is an effective formal method for estimating a relevance model with no training data.
</TEXT>
</DOC>
~~~~


**Maven Commands to run in local**


 1. mvn clean install
 
 2. mvn jetty:run

_**Credits :-**_  https://github.com/jiepujiang/LuceneTutorial