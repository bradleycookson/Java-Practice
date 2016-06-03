
/**
 * WordSearch class for searching a .txt document line by line to output the number of times a word appears
 * and on which line.
 * 
 * @author (Bradley Cookson) 
 * @version (3/8/16)
 */ 

import java.util.*;
import java.io.*;
import java.lang.*;
public class WordSearch
{
    // Fields
    private String word, line;
    private int count, lineCount, characterMatch;

    /**
     * Constructor method to initialize the class fields to null or 0.
     */
    public WordSearch() 
    {
        word = line = null;
        count = lineCount = characterMatch = 0;
    }

    /**
     * Constructor method for the the search word.
     * 
     * @param inSearchWord
     */
    public WordSearch(String inSearchWord) 
    {
        word = inSearchWord;
    }

    /**
     * countWords method that uses a series of nested loops to chech a .txt file
     * for the search word and prints out where the word was found and how many times
     * 
     * @param word, dataFile
     */
    public void countWords(String word, Scanner dataFile) {
        while (dataFile.hasNextLine()) {
            line = dataFile.nextLine();
            lineCount++;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == word.charAt(0)) {
                    for (int x = 0; x < word.length(); x++) {
                        if (line.charAt(i) == word.charAt(x)) {
                            characterMatch++;
                            i++;
                        }
                        if (characterMatch == word.length()) {
                            System.out.println("Word found on line: " + lineCount);
                            System.out.println(" ");
                            count++;
                        }
                    }
                }
            }
        }
        if (count != 0) {
            System.out.println("The word was found " + count + " time(s).");
        } else {
            System.out.println("That word is not in the document");
        }
        dataFile.close();
    }

    /**
     * getWord() method for accessing the word field
     */
    public String getWord() 
    {
        return word;
    }

     /**
     * getLine() method for accessing the line field
     */
    public String getLine() 
    {
        return line;
    }

     /**
     * getCount() method for accessing the count field
     */
    public int getCount() 
    {
        return count;
    }

     /**
     * getLineCount() method for accessing the lineCount field
     */
    public int getLineCount() 
    {
        return lineCount;
    }

     /**
     * getCharacterMatch() method for accessing the characterMatch field
     */
    public int getCharacterMatch() 
    {
        return characterMatch;
    }

    /**
     * setWord() method for setting the search field
     * 
     * @param inSearchWord
     */
    public void setWord(String inSearchWord) 
    {
        word = inSearchWord;
    }

    /**
     * setLine() method for setting the line field
     * 
     * @param dataFile
     */
    public void setLine(Scanner dataFile) 
    {
        line = dataFile.next(); 
    }
}
