
    public class Entry<E> {
        //klassenattribute
        private Modul modul ;

        // hier wird das Eintrag von Modul erstellen und überprüft ob er null oder nicht
        public Entry  (Modul einmodul){
            if (einmodul == null ) {throw new IllegalArgumentException();}
            modul = einmodul;
        }
        @Override
        public String toString() {
            return "Entry [modul=" + modul + "]";
        };

    }


