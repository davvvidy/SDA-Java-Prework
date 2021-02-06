import java.util.*;

public class Task14 {

    public static class Computer {
        private String motherboard;
        private Processor processor;
        private Ram[] ramSlots;

        private HD[] HDSlots;
        private String monitor;
        private String printer;

        public Computer(String motherboard, Processor processor, Ram ram, HD hd) {
            this.motherboard = motherboard;
            this.processor = processor;
            this.ramSlots = new Ram[4];
            this.HDSlots = new HD[2];
        }

        public String toString() {
            return "Computer: " + motherboard + "\n" + processor + "\n" + getAllRams() + getAllHDs();
        }

        public String getMotherboard() {
            return motherboard;
        }

        public Processor getProcessor() {
            return processor;
        }

        public Ram getRam(int index) {
            return this.ramSlots[index];
        }

        public String getAllRams() {
            String addRam;
            String totalRam = "";
            int counter = 1;
            for(int i = 0; i < ramSlots.length; i++) {
                if(ramSlots[i] != null) {
                    addRam = getRam(i).toString();
                    totalRam += counter + "." + addRam + "\n";
                    counter++;
                }
            }
            return totalRam;
        }

        public HD getHD(int index) {
            return this.HDSlots[index];
        }

        public String getAllHDs() {
            String addHD;
            String totalHD = "";
            int counter = 1;
            for(int i = 0; i < HDSlots.length; i++) {
                if(HDSlots[i] != null) {
                    addHD = getHD(i).toString();
                    totalHD += counter + "." + addHD + "\n";
                    counter++;
                }
            }
            return totalHD;
        }

        public void setMotherboard(String motherboard) {
            this.motherboard = motherboard;
        }

        public void setProcessor(Processor processor) {
            this.processor = processor;
        }

        public void setRam(Ram ram, int index) {
            this.ramSlots[index] = ram;
        }

        public void setHD(HD hd, int index) {
            this.HDSlots[index] = hd;
        }

        public void addRam(Ram ram) {
            for(int i = 0; i < ramSlots.length; i++) {
                if(ramSlots[i] == null) {
                    this.ramSlots[i] = ram;
                    break;
                    } else if((ramSlots[ramSlots.length-1] != null) && (ram.size < ramSlots[i].size)) {
                        this.ramSlots[i] = ram;
                        break;
                }
            }
        }

        public void addHD(HD hd) {
            for(int i = 0; i < HDSlots.length; i++) {
                if(getHD(i) == null) {
                    this.HDSlots[i] = hd;
                    break;
                } else if((HDSlots[HDSlots.length-1] != null) && (hd.type.equals("SSD") && this.HDSlots[i].type.equals("HDD"))) {
                    this.HDSlots[i] = hd;
                    break;
                }
            }
        }
    }

    public static class Processor {
        private String name;
        private int cores;

        public Processor(String name, int cores) {
            this.name = name;
            this.cores = cores;
        }

        public String getName() {
            return name;
        }

        public int getCores() {
            return cores;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }

        public String toString() {
            return "Processor: " + name + " " + cores + "cores ";
        }
    }

    public static class Ram {
        private String name;
        private int size;

        public Ram(String name, int size) {
            this.name = name;
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public int getSize() {
            return size;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String toString() {
            return "Ram: " + name + " " + size + "gb ";
        }

    }

    public static class HD {
        private String producer;
        private String size;
        private String type;

        public HD(String producer, String size, String type) {
            this.producer = producer;
            this.size = size;
            this.type = type;
        }

        public String getProducent() {
            return producer;
        }

        public String getSize() {
            return size;
        }

        public String getType() {
            return type;
        }

        public void  setProducer(String producer) {
            this.producer = producer;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String toString() {
            return "Hard disc: " + producer + " " + type + " " + size + " ";
        }
    }

    public static class ComputerApp {


        public static void main(String[] args) {

            Processor firstProcessor = new Processor("Intel I5-3570" , 2);
            Ram firstRam = new Ram("RamName", 8);
            HD firstHD = new HD("Icybox", "512GB", "SSD");
            Computer firstComputer = new Computer("Asus Strix B250F", firstProcessor, firstRam, firstHD);
            Ram secondRam = new Ram("Second Ram", 16);
            HD secondHD = new HD("HDFirm", "1024gb", "HDD");
            HD thirdHD = new HD("Selegate", "256GB", "SSD");


            firstComputer.setRam(firstRam, 0);
            firstComputer.addRam(secondRam);
            firstComputer.setHD(firstHD, 0);
            firstComputer.addHD(secondHD);
            System.out.println(firstComputer.toString());

            Ram thirdRam = new Ram ("Third Ram", 16);
            Ram fourthRam = new Ram("Fourth Ram", 16);
            Ram smallerRam = new Ram("lowerRam", 4);
            Ram biggerRam = new Ram("Bigger Ram", 16);
            firstComputer.addRam(thirdRam);
            firstComputer.addRam(fourthRam);
            firstComputer.addRam(smallerRam);
            firstComputer.addRam(biggerRam);
            firstComputer.addHD(thirdHD);
            System.out.println(firstComputer.toString());

            firstComputer.setMotherboard("New Asus Strix");
            Processor newProcessor = new Processor("Intel I7 new", 6);
            firstComputer.setProcessor(newProcessor);
            System.out.println(firstComputer.toString());
        }
    }
}