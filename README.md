# dictionary_api
This is a java end point for a dictionary parsed from Wiktionary database

## Steps to take
### Step 1
Download the wiktionary dump file from this (Wiktionary page)[https://dumps.wikimedia.org/enwiktionary/20220320/enwiktionary-20220320-pages-articles.xml.bz2]
- Replace 20220320 with your current date

### Step 2
Clone this repo

### Step 3
Download the Oracle Berkeley DB Java Edition from (here)[https://www.oracle.com/database/technologies/related/berkeleydb-downloads.html#license-lightbox].If the link is broken, just search for Berkeley DB, go to downloads and download the Java Edition (preferably the zip file)

### Step 4
Download the JWKTL jar file from (here)[https://search.maven.org/search?q=a:dkpro-jwktl]

### Step 5
Add the the jar files of both Berkeley DB and JWKTL to your classpath
- In the folder you extracted the Berkeley zip file to, go to the lib folder and find a jar file (name would have this signature: je-{*version*}.jar)
- Note copy the path to this file
- Add this classpath to your environmental variables under the CLASSPATH variable. (Search for environmental variables in windows, click on environmental varibles in the window shown, in the bottom section, click add and add CLASSPATH as a variable name and the file location as variabe value)
- Do the same thing for the donwloaded jar file for JWKTL. In this case, just add the file location of the downloaded jar file
- Note that the two file locations (that of Berkeley BD and JWKTL) should be separated by a semi-colon (;) in the variable value.

### Step 6
If all the above went correctly, it is time to run the program.
- The initial step will be to parse the entire wiktionary dump and store in a directory which will be specified by you
- In otherwords, you will have to uncomment the code and replace 'PATH_TO_DUMP_FILE' with the path to the downloaded wiktionary dump file
- You will also have to specify the TARGET_DIRECTORY. So just uncomment the String `outDir variable` declared in the code and fill your target dir there.
- Parsing the data takes a while (2 hrs in my case), so be patient and grap a cup of office. Ensure you have power also

### Step 7
When the parsing is complete, comment out the `main` function to avoid parsing the database everytime (If you have a better way to go about this, do reach out!)

### Step 8
Run the program again and head over to http://localhost:8080/search?YOURTEXTGOESHERE 
- The different meanings of the word in the url are separated by *****
