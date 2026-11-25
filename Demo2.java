class Demo2 {
    public static void main(String[] args) {
        Classroom c101 = new Classroom();
        c101.capacity = 67;
        c101.noOfBoys = 30;
        c101.noOfGirls = 37;
        c101.classNumber = 101;
        
        System.out.println("Capacity: " + c101.getCapacity());
        System.out.println("Occupancy: " + c101.getOccupancy() + "%");
    }
}

// Custom Class
class Classroom {
    int capacity;
    int noOfBoys;
    int noOfGirls;
    int classNumber;

    int getCapacity() {
        return capacity;
    }

    float getOccupancy() {
        double rate = (double) (noOfBoys + noOfGirls) / capacity;
        return (float) (rate * 100);
    }

    int getClassNumber() {
        return classNumber;
    }
}
