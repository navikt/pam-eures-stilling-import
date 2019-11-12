# EuresAPI

# Beskrivelse: 
Webapplikasjon for å vise europeiske stillingsutlysninger som resultat av et forhåndsdefinert søk mot EURES-databasen.

## Running on localhost

### Prerequisites


#### If run from within the NAV firewall(s), configure a proxy to be able to access the EURES server

#### Backend and frontend
Start a command shell:  
```
cd <Your workspace/project root>/euresapi/war
runWithMvn
```

In browser: http://localhost:1337/index.html

### Running in embedded servlet container (Tomcat) and Node

# Tricks
- Fetch codes from EURES:
    - Edit EuresApiItemList_Main.jsx removing or adding the attribute hidden={true} in the \<div\> element enclosing the \<input\> element with the id {ID_RADIO_KODELISTER}
    - Edit the URL directly in the browser to access the rest resources directly
        - <root>/euresapi/rest/SearchJobs
        - <root>/euresapi/rest/GetCodeLists
        - <root>/euresapi/rest/SelfTest
        - <root>/euresapi/rest/AreYouAlive
        - <root>/euresapi/rest/Ping
        - <root>/euresapi/rest/SourceStatus
