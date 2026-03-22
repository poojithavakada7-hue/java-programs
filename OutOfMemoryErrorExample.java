class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        try {
            int arr[] = new int[1000000000];
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught!");
        }
    }
}