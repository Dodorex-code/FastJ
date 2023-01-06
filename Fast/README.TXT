------------------------------------------------------------------------
Dies ist die README-Datei des Projekts. Hier sollten Sie Ihr Projekt
beschreiben.
Erzählen Sie dem Leser (jemand, der nichts über dieses Projekt weiss),
alles, was er/sie wissen muss. Üblicherweise sollte der Kommentar 
zumindest die folgenden Angaben umfassen:
------------------------------------------------------------------------

PROJEKTBEZEICHNUNG: a collection of methods to make working with java a bit nicer
PROJEKTZWECK: /
VERSION oder DATUM: 1.0
WIE IST DAS PROJEKT ZU STARTEN: you dont. this is only a collection of methods that must be imported( import Fast.Fast; ) in order to be used
AUTOR(EN): Jonathan Gamble
BENUTZERHINWEISE: /
DOKUMENTATION:
                    ------------FUNKTION------------|------------ERKLAERUNG------------|------------BEISPIEL------------
                    Fast.print(String str)          |Der String str wird in der konsole| Fast.print("Hallo Welt!");
                                                    |ausgegeben wie es bei             |
                                                    |System.out.println() der fall ist.|
                    
                    Fast.delay(int duration)        |Das programm macht einen durch    | Fast.delay(2);
                                                    |duration angegebene pause.        |
                                                    |Die duration wird in sekunden     |
                                                    |angegeben.                        |
                                                    
                    Fast.input()                    |Was ein mensch engibt, wird damit | name = Fast.input();
                                                    |zurückgegeben (returned).         | Fast.print("Hallo " + name);
                                                    
                    Fast.write_to_file(             |Der String dat" wird in der datei | Fast.write_to_file("test.txt", "Ich bin ein text in einer datei.");
                      String filepath, String data) | an dem ort filepath gespeichert. |
                                                    |ACHTUNG: alles was vorher in der  |
                                                    |datei war wird geloescht!         |
                                            
                    Fast.read_file(String filepath) |Alles was in der datei ist, wird  | datei_inhalt = Fast.read_file("test.txt");
                                                    |als String zurückgegeben.         |
                                                    
                    Fast.clear_file()               |Alles was sich in der datei ist,  | Fast.clear_file("test.txt");
                                                    |wird geloescht.                   |