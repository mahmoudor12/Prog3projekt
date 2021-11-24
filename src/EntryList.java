
import java.util.ArrayList;

    public class EntryList {
        //Klassenattribute
        private ArrayList <Entry<Modul>> entrylist;
        // hier wird die Einträgeliste angelegt
        public EntryList(){
            entrylist = new ArrayList<Entry<Modul>>();

        }
        // man fügt einen Eintrag hinzu
        public void EntryAdd(Entry<Modul>     ent ) {
            if (ent == null) {
                throw new IllegalArgumentException("der Eintrag soll nicht leer sein danke :)");
            }
            entrylist.add(ent);
        }
        // man kann den Eintrag löeschen
        public void EntryLoesch(Entry <Modul>    ent ) {
            if (ent == null) {
                throw new IllegalArgumentException("der Eintrag soll nicht leer sein danke :)");
            }
            entrylist.remove(ent);
        }
        // man kann den Eintag ändern
        public void EntryAendere(Entry<Modul>     ent1 , Entry <Modul> ent2 ) {
            if (ent2 == null) {
                throw new IllegalArgumentException("der Eintrag soll nicht leer sein danke :)");
            }


            entrylist.add(entrylist.indexOf(ent1),ent2);

        }
        // den Eintrag wird gezeigt
        public Entry<Modul> EntryGET(int index){
            return entrylist.get(index);
        }

        @Override
// dadurch kann alle Einträge gezeigt werden .
        public String toString() {
            return "EntryList [entrylist=" + entrylist + "]";
        }


    }


