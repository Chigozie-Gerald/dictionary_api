package com.example.rest_service;

import java.io.File;
import java.util.List;

import de.tudarmstadt.ukp.jwktl.JWKTL;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEntry;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryPage;
import de.tudarmstadt.ukp.jwktl.api.IWiktionarySense;

public class Dictionary {
	//final String outDir = TARGET_DIRECTORY;
	public static void main(String[] args) throws Exception {
		  //File dumpFile = new File(PATH_TO_DUMP_FILE);
		  //File outputDirectory = new File(outDir);
		  //boolean overwriteExisting = true;
		    
		  //JWKTL.parseWiktionaryDump(dumpFile, outputDirectory, overwriteExisting);
		}
    public String getInfo (String text) throws Exception {
    try {
    	
    	// Connect to the Wiktionary database.
        File wiktionaryDirectory = new File(outDir);
        IWiktionaryEdition wkt = JWKTL.openEdition(wiktionaryDirectory);
        
        //TODO: Query the data you need.
        // Close the database connection.
        List<IWiktionaryPage> pages = wkt.getPagesForWord(text, true);
        String str = "";
        if(!pages.isEmpty()) {
        		IWiktionaryEntry entry = pages.get(0).getEntry(0);
            	for (IWiktionarySense sen : entry.getSenses()) {
            		str = str + sen.getGloss().getText() + "*****";
            	}

                wkt.close();
            return str;
            
        }else {
        	return "";
        }
        
    }
    catch(Exception e){
    	e.printStackTrace();
    	return "";
    }
    
        }
}