class FinalVariableDemo {
    // final variable
    final int speedLimit = 90;

    void changeLimit() {
         speedLimit = 120;  
        System.out.println("Speed Limit is: " + speedLimit);
    }

    public static void main(String[] args) {
        FinalVariableDemo obj = new FinalVariableDemo();
        obj.changeLimit();
    }
}
