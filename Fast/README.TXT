
PROJEKTBEZEICHNUNG: a collection of methods to make working with java a bit nicer
PROJEKTZWECK: /
VERSION oder DATUM: 1.3
WIE IST DAS PROJEKT ZU STARTEN: you dont. this is only a collection of methods that must be imported( import Fast.*;) in order to be used
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
                                                    
                    GUI.create_window()             |Ein neues fenster wird erstellt.  | GUI.create_window();
                                                    |Es hat noch keine attribute.      |
                                                
                    GUI.setup_window(String name,   |Dem zuvor erstelltem window werden| GUI.setup_window("Mein Name", 1280, 720, false, true);
                      int width, int height,        |attribute wie ein name, width und |
                      boolean resizable,            |height, resizable (ob die groesse |
                      boolean center_on_screen)     |veraendert werden kann) und       |
                                                    |center_on_screen (ob es in der    |
                                                    |mitte des bildschirms erscheinen  |
                                                    |soll) zugetielt.                  |
                                        
                    GUI.set_window_background       |Veraender die hintergrundfarbe des| GUI.set_window_background_color(Color.YELLOW);
                      _color(Color color)           |windows.                          |
                      
                    GUI.make_text(String text)      |Erstellt einen text, welcher      | GUI.make_text("Das ist ein Text.");
                                                    |spaeter mit der GUI.add_labels()  |
                                                    |methode zum window hinzugefuegt   |
                                                    |wird. Sie returned auch eine      |
                                                    |Referenz zu dem erstellten JLabel.|
                                                    
                    GUI.make_image(String image)    |Erstellt ein image von einem      | GUI.make_image("mein_bild.png");
                                                    |dateipfad, welches spaeter mit der|
                                                    |GUI.add_labels() methode zum      |
                                                    |window hinzugefuegt werden muss.  |
                                                    |Sie returned auch eine Referenz zu|
                                                    |dme erstellten Jlabel.            |
                                                    
                    GUI.add_labels()                |Nachdem alle GUI.make_text() und  | Gui.add_labels();
                                                    |GUI.make_image() mathoden         |
                                                    |aufgerufen wurden, werden hiermit |
                                                    |alle texte und images zum window  |
                                                    |hinzufefuegt. Dies sollte and ende|
                                                    |des programms gemacht werden.     |
                                                    
                    GUI.get_window()                |Returned eine referenz zu dem     | JFrame mein_window = GUI.get_window();
                                                    |mit GUI.create_window() erstelltem|
                                                    |window.                           |
                                                    
                    GUI.animate(JLabel label,       |ACHTUNG: NOCH NICHT FERTIG!!      | GUI.animate(mein_label, mein_array_aus_image_icons);
                      ImageIcon[] frames,           |nimmt einen JLabel und frames     |
                    boolean loops)                  |welche animiert werden.           |
                    
                    Play.generate_glc_in_editor(    |generiert als output einen code,  |
                      String class_name, int fps)   |welcher in die angegebene klasse  |
                                                    |eingefuegt wird um eine game loop |
                                                    |bei gewuenschten fps zu machen.   |
                                            
                    Fast.fmath.Teiler(int n)        |Printed jeden teiler des integer n| Fast.fmath.Teiler(20);
                    
                    Fast.fmath.AnzahlTeiler(int n)  |Gibt die Anzahl der Teiler einer  | Fast.fmath.AnzahlTeiler(16);
                                                    |Zahl n zurueck.                   |
                                                    
                    Fast.fmath.IstPrimzahl(int n)   |Returned einen boolean ob n eine  | Fast.fmath.IstPrimzahl(97);
                                                    |Primzahl ist.                     |
                                                    
                    Fast.fmath.PrimzahlenInRange(int|Printed alle Primzahlen zwischen  | Fast.fmath.PrimzalenInRange(0,100);
                      start, int end)               |start und end.                    |
                      
                    Fast.fmath.InvSqrt(int value)   |Returned die invertierte          | Fast.fmath.InvSqrt(9);
                                                    |quadratwurzel der Zahl value.     |
                                                    
                    Fast.fmath.Dot2D(double x1,     |Returned das Dot-Product zweier   | Fast.fmath.Dot2D(4,3,5,-2); //[x:4,y:3] und [x:5,y:-2]
                      double y1, double x2,         |Vektoren mit x1,y1 und x2,y2.     |
                      double y2)                    |                                  |
                      
                    Fast.fmath.Mag2D(double x,      |Returned die laenge eines Vektors | Fast.fmath.Mag2D(4,3); //hier: laenge 5.00
                      double y)                     |mit x und y.                      |
                      
                    Fast.fmath.Mag3D(double x,      |Returned die laenge eines Vektors | Fast.fmath.Mag3D(4,3,9); //hier: laenge 10.29
                      double y, double z)           |mit x, y und z.                   |
                      
                    Fast.fmath.Dot3D(double x1,     |Returned das Dot-Product zweier   | Fast.fmath.Dot3D(4,3,9,5,-2,11); //[x:4,y:3,z:9] und [x:5,y:-2,z:11]
                      double y1,double z1,double x2,|Vektoren mit x1,y1,z1 und x2,y2,z2|
                      double y2, double z2)         |                                  |
                      
                    Fast.fmath.Dist2D(double x1,    |Returned die entfernung zwischen  | Fast.fmath.Dist2D(4,12,-3,5); //[x:4,y:12] und [x:-3,y:5]
                      double y1, double x2,         |zwei Vektoren mit x1,y1 und x2,y2.|
                      double y2)                    |                                  |
                      
                    Fast.fmath.Dist3D(double x1,    |Returned die entfernung zwischen  | Fast.fmath.Dist3D(4,12,8,-3,5,0); //[x:4,y:12,z:8] und [x:-3,y:5,z:0]
                      double y1,double z1,double x2,|zwei Vektoren mit x1,y1,z1 und    |
                      double y2, dobule z2)         | x2,y2,z2.                        |
                      
                    Fast.fmath.Angle2D(double x1    |Returned den winken zwischen zwei | Fast.fmath.Angle2D(-4,6,3,15); //[x:-4,y:6] und [x:3,y:15]
                      double y1, double x2,         |Vektoren mit x1,y1 und x2,y1.     |
                      double y2)                    |                                  |