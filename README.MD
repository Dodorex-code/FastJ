                    Fast.print(String str)          |Der String str wird in der konsole| Fast.print("Hallo Welt!");
                                                    |ausgegeben wie es bei             |
                                                    |System.out.println() der fall ist.|
                    
                    Fast.delay(int duration)        |Das programm macht einen durch    | Fast.delay(2);
                                                    |duration angegebene pause.        |
                                                    |Die duration wird in sekunden     |
                                                    |angegeben.                        |
                                                    
                    Fast.input()                    |Was ein mensch engibt, wird damit | name = Fast.input();
                                                    |zurückgegeben (returned).         | Fast.print("Hallo " + name);
                                                    
                    Fast.write_to_file(             |Der String data wird in der datei | Fast.write_to_file("test.txt", "Ich bin ein text in einer datei.");
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
                                                    
                    GUI.make_image(String image,    |Erstellt ein image von einem      | GUI.make_image("mein_bild.png", 128, 256);
                          int width, int height)    |dateipfad, welches spaeter mit der|
                                                    |GUI.add_labels() methode zum      |
                                                    |window hinzugefuegt werden muss.  |
                                                    |Sie returned auch eine Referenz zu|
                                                    |dem erstellten Jlabel.            |
                                                    
                    GUI.add_labels()                |Nachdem alle GUI.make_text() und  | Gui.add_labels();
                                                    |GUI.make_image() mathoden         |
                                                    |aufgerufen wurden, werden hiermit |
                                                    |alle texte und images zum window  |
                                                    |hinzufefuegt. Dies sollte and ende|
                                                    |des programms gemacht werden.     |
                                                    
                    GUI.get_window()                |Returned eine referenz zu dem     | JFrame mein_window = GUI.get_window();
                                                    |mit GUI.create_window() erstelltem|
                                                    |window.                           |

                    GUI.create_frame_sequence       |erstellt einen ImageIcon Array,   | GUI.create_frame_sequence("./res/enemy_idle_", 20, ".png", 128, 128); // voller name
                    (String prefix, int count,      |der zum animieren genutzt werden  | wäre dann z.B. "./res/enemy_idle_0.png" , "./res/enemy_idle_1.png" , 
                    String suffix,                  |kann. Es wird dabei davon         | "./res/enemy_idle_2.png" , etc...
                    int width, int height)          |ausgegangen, dass die namensgebung|
                                                    |der frame dateien dem gleiche     |
                                                    |Schema folgen (siehe beispiel)    |

                    GUI.registerAnimation           |Registriert im GUI, dass eine     | GUI.registerAnimation(mein_image, mein_image_frames);
                    (JLabel image,                  |frame sequence zu einem JLabel    |
                    ImageIcon[] frame_sequence)     |gehört. Der ImageIcon[] array     |
                      	                            |wird am besten mit                |
                                                    |GUI.create_frame_sequence()       |
                                                    |erstellt.                         |
                                                    
                    GUI.animate()                   |Muss in der update() methode      | GUI.animate();
                                                    |aufgerufen werden, um alles, was  |
                                                    |animiert werden soll zu animieren |
                                                    |ACHTUNG: DAS IST KEIN ASYNCHRONER |
                                                    |PROZESS!                          |

                    GUI.addKeyboard(Keyboard        |Fügt dem Fenster ein keyboard     | Keyboard meinKeyboard = new Keyboard();
                    kboard)                         |hinzu, welches genutzt werden kann| GUI.addKeyboard(meinKeyboard);
                                                    |um zu prüfen, welche keyboard-keys|
                                                    |gerade gedrückt sind              |
                    
                    Keyboard.isKeyPressed(String    |gibt einen boolean zurück je      | Keyboard meinKeyboard = new Keyboard();
                    key)                            |nachdem, ob der gweünschte key    | GUI.addKeyboard(meinKeyboard);
                                                    |gedrückt ist oder nicht           |
                                                    |ACHTUNG: setzt vorraus, dass zuvor| if(meinKeyboard.isKeyPressed("w"))
                                                    |eine instanz der Keyboard Klasse  | {
                                                    |mit GUI.addKeyboard() dem Fenster |    //code hier
                                                    |hinzugefügt wurde                 | }

                    
                    Play.generate_glc_in_editor(    |generiert als output einen code,  |
                      String class_name, int fps)   |welcher in die angegebene klasse  |
                                                    |eingefuegt wird um eine game loop |
                                                    |bei gewuenschten fps zu machen.   |