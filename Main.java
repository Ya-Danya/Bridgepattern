package ru.edu.hse;

public class Main {
    interface Stuffing {
        void stuffPillow();
    }
    class NaturalStuff implements Stuffing {
        public void stuffPillow(){
        }
    }
    class ArtificialStuff implements Stuffing {
        public void stuffPillow(){
        }
    }
    abstract class Pillow {
        protected Stuffing stuff;
        public Pillow(Stuffing stuff){
            this.stuff = stuff;
        }
        abstract public void stuff();
    }

    class BPillow extends Pillow {
        public BPillow(Stuffing stuff) {
            super(stuff);
        }
        public void stuff() {
            stuff.stuffPillow();
        }
    }

    class APillow extends Pillow {
        public APillow(Stuffing stuff) {
            super(stuff);
        }
        public void stuff() {
            stuff.stuffPillow();
        }
    }
}
